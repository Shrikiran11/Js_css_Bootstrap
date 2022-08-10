const numbers = [1,2,3,4];
//The forEach() method executes a provided function once for each array element. 
numbers.forEach(myFunction);
function myFunction(item) {
 let cube= item*item*item;
 console.log(cube);
}