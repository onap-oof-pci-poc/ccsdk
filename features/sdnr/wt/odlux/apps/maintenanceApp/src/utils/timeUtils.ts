export function convertToGMTString(dateString: string): string {
  const date = new Date(dateString);
  const pad = (n: number) => (n < 10) ? '0' + n : n;

  return date.getUTCFullYear() +
    '-' + pad(date.getUTCMonth() + 1) +
    '-' + pad(date.getUTCDate()) +
    'T' + pad(date.getUTCHours()) +
    ':' + pad(date.getUTCMinutes()) +
    '+00:00';
}

export function convertToLocaleString(rawDate: string| number): string {
  const date = new Date(rawDate);
  const pad = (n: number) => (n < 10) ? '0' + n : n;

  return date.getFullYear() +
    '-' + pad(date.getMonth() + 1) +
    '-' + pad(date.getDate()) +
    'T' + pad(date.getHours()) +
    ':' + pad(date.getMinutes());
}