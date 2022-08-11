//empty object
const student = {};
//The Object.defineProperties() method defines new or modifies existing properties directly on an object, returning the object. 
Object.defineProperties(student, {
  internals: {
    value: 70,
    writable: true
  },
  finalSem: {
    value:55,
    writable:false
  }
  
});
//works becoz property writable:true
student.internals=80;
//does not work becoz property writable:false
student.finalSem=75;

console.log(student.internals);//80
console.log(student.finalSem);//55

