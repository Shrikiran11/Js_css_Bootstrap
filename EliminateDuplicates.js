//Eleminate duplicate from a array using Arrays.from()
const set = new Set([1,2,3,4,1,2,3]);
const elem=new Set(['foo', 'bar', 'baz', 'foo','baz']);
const c=Array.from(set);
console.log(c);
const d=Array.from(elem);
console.log(d);