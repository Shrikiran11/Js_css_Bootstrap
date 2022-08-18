//Arrays.conat();
const a1 = ['a', 'b', 'c'];
const a2 = ['d', 'e', 'f'];
//creates a new array
const a3 = a1.concat(a2);
console.log(a3);//[ 'a', 'b', 'c', 'd', 'e', 'f' ]
//Arrays.copyWithin()
a3.copyWithin(1,3,5);
console.log(a3);//[ 'a', 'd', 'e', 'd', 'e', 'f' ]
//Arrays.pop()
a3.pop();
console.log(a3);//[ 'a', 'd', 'e', 'd', 'e' ]
//Arrays.push()
let v=a3.push('m');
console.log(a3);//[ 'a', 'd', 'e', 'd', 'e', 'm' ]
console.log(v);//6
//Arrays.reduce()
const val=a3.reduce((a,b)=>a+b,'e')
console.log(val);
//Arrays.shift()
a3.shift();
console.log(a3);//[ 'd', 'e', 'd', 'e', 'm' ]
console.log(a3.unshift('w'));//6
console.log(a3);//[ 'w', 'd', 'e', 'd', 'e', 'm' ]