import * as React from 'react';
import * as marked from 'marked';

import { resolvePath } from '../utilities/path';

import { IApplicationStoreState } from '../../../../framework/src/store/applicationStore';
import connect, { Connect } from '../../../../framework/src/flux/connect';

import { Markdown } from "../components/markdown";

import '!style-loader!css-loader!github-markdown-css/github-markdown.css'

const mapProps = (state: IApplicationStoreState) => ({
  content: state.help.content,
  currentPath: state.help.currentPath
});

type HelpApplicationComponentProps = Connect<typeof mapProps>;

class HelpApplicationComponent extends React.Component<HelpApplicationComponentProps> {

  /**
   * Initializes a new instance.
   */
  constructor(props: HelpApplicationComponentProps) {
    super(props);

    this.renderer = new marked.Renderer();

    this.renderer.link = (href: string, title: string, text: string) => {
      // check if href is rel or abs
      const absUrlMatch = href.trim().match(/^https?:\/\//i);
      return `<a href="${ absUrlMatch ? href : resolvePath('#/helpApp/', this.props.currentPath || '/', href) }" title="${ title }" >${ text }</a>`
    };

    this.renderer.image = (href: string, title: string) => {
      return `<img src="${ resolvePath('/help/', this.props.currentPath || '/',  href) }" alt="${ title }" />`
    };

  }

  render(): JSX.Element {
    return this.props.content ? (
      <Markdown text={ this.props.content } markedOptions={ { renderer: this.renderer } } className="markdown-body"
         style={{ maxWidth: "960px", margin: "1.5em auto" }} />
    ) : (<h2>Loading ...</h2>)
  }

  private renderer: marked.Renderer;
}

export const HelpApplication = connect(mapProps)(HelpApplicationComponent);
export default HelpApplication;