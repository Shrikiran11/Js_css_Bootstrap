//The flat() method creates a flattened array of given depth
const arr2 = ["sk", 9.22, 2022, [[[21, 9.12]]]];

console.log(arr2.flat());//Array ["sk", 9.22, 2022, Array [Array [21, 9.12]]]
console.log(arr2.flat(2));//Array ["sk", 9.22, 2022, Array [21, 9.12]]
console.log(arr2.flat(3));// Array ["sk", 9.22, 2022, 21, 9.12]
//removes holes in array
const arr3=["c","l", ,"a", ,"f","i","n"]
console.log(arr3.flat());//Array ["c", "l", "a", "f", "i", "n"]