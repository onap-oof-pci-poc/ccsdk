export const resolvePath = (...paths: string[]): string => {
  function resolve(pathA: string, pathB: string) {
    //  ‘a’     => ['a']
    //  'a/b'   => ['a', 'b']
    //  '/a/b'  => ['', 'a', 'b']
    //  '/a/b/' => ['', 'a', 'b', '']
    const pathBParts = pathB.split('/');
    if (pathBParts[0] === '') {
      return pathBParts.join('/');
    }
    const pathAParts = pathA.split('/');
    const aLastIndex = pathAParts.length - 1;
    if (pathAParts[aLastIndex] !== '') {
      pathAParts[aLastIndex] = '';
    }

    let part: string;
    let i = 0;
    while (typeof (part = pathBParts[i]) === 'string') {
      switch (part) {
        case '..':
          pathAParts.pop();
          pathAParts.pop();
          pathAParts.push('');
          break;
        case '.':
          pathAParts.pop();
          pathAParts.push('');
          break;
        default:
          pathAParts.pop();
          pathAParts.push(part);
          pathAParts.push('');
          break;
      }
      i++;
    }
    if (pathBParts[pathBParts.length - 1] !== '') pathAParts.pop(); 
    return pathAParts.join('/');
  }

  let i = 0;
  let path: string;
  let r = location.pathname;

  const urlRegex = /^https?\:\/\/([^\/?#]+)(?:[\/?#]|$)/i;
  const multiSlashReg = /\/\/+/g;

  while (typeof (path = paths[i]) === 'string') {
    debugger;
    const matches = path && path.match(urlRegex);
    if (matches || !i) {
      r = path;
    } else {
      path = path.replace(multiSlashReg, '/');
      r = resolve(r, path);
    }
    i++;
  }

  return r;
};