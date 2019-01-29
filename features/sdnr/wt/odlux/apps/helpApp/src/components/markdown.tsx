import * as React from 'react';

import * as marked from 'marked';
import * as hljs from 'highlight.js';

type MarkdownComponentProps = {
  text: string;
  className?: string;
  markedOptions?: marked.MarkedOptions;
  style?: React.CSSProperties
}

const defaultRenderer = new marked.Renderer();
defaultRenderer.link = (href, title, text) => (
  `<a target="_blank" rel="noopener noreferrer" href="${ href }" title="${ title }">${ text }</a>`
);


class MarkdownComponent extends React.Component<MarkdownComponentProps> {
  constructor(props: MarkdownComponentProps) {
    super(props);

    const markedOptions: marked.MarkedOptions = {
      gfm: true,
      tables: true,
      breaks: false,
      pedantic: false,
      sanitize: true,
      smartLists: true,
      smartypants: false,
      langPrefix: 'hljs ',
      ...(this.props.markedOptions || {}),
      highlight: (code, lang) => {
        if (!!(lang && hljs.getLanguage(lang))) {
          return hljs.highlight(lang, code).value;
        }
        return code;
      }
    };

    marked.setOptions(markedOptions);
  }
  render() {
    const { text, className, style } = this.props;
    
 
    const html = (marked(text || '', { renderer: this.props.markedOptions && this.props.markedOptions.renderer || defaultRenderer }));

    return (
      <div
        dangerouslySetInnerHTML={ { __html: html } }
        className={ className }
        style={ style }
      />
    );
  }
}

export const Markdown = MarkdownComponent;

