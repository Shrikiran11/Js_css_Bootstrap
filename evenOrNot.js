//function to check even or not
const check=(x)=>x%2==0;
const array1=[1,30,39,29,10,13];
const array2=[2,4,6,8,12,18,20];
//The every() method tests whether all elements in the array pass the test implemented by the provided function. It returns a Boolean val
console.log(array1.every(check));
// expected output: false
console.log(array2.every(check));
// expected output: true
