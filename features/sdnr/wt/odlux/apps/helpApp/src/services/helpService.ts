import { requestRest } from '../../../../framework/src/services/restService';
import { TocTreeNode, TocNodeCollection } from '../models/tocNode';

class HelpService {

  private tocNodeCollection: TocTreeNode[] | null = null;
  private documents: { [path: string]: string | null } = {};

  public async getDocument(path: string): Promise<string | null> {
    // check if the result is allready in the cache
    if (this.documents[path]) return Promise.resolve(this.documents[path]);
    
    // request the document
    const result = await requestRest<string>(`/help/${ path }`.replace(/\/{2,}/i, '/'));
    if (result) {
      this.documents[path] = result;
    }
    return this.documents[path] || null;
  }

  public async getTableOfContents(): Promise<TocTreeNode[] | null> {
    // check if the result is allready in the cache
    if (this.tocNodeCollection) return Promise.resolve(this.tocNodeCollection);

    // request the table of contents
    const result = await requestRest<TocNodeCollection>('/help/?meta');
    if (result !== false) {
      const mapNodesCollection = (col: TocNodeCollection): TocTreeNode[] => {
        return Object.keys(col).reduce <TocTreeNode[]>((acc, key) => {
          const current = col[key];
          acc.push({
            label: current.label,
            uri: current.versions.current.path,
            nodes: current.nodes && mapNodesCollection(current.nodes) || undefined
          });
          return acc;
        }, []);
      }

      this.tocNodeCollection = result && mapNodesCollection(result);
    }
    return this.tocNodeCollection  || null;
  }
}

export const helpService = new HelpService();
export default helpService;