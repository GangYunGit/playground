export function getImgUrl(url: string, name: string | number) {
  return new URL(url + '/' + name + '.png', 'https://localhost:3000/src/assets/').href
}