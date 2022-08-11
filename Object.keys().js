const emp1 = {
    name: 'Myname',
    age: 22,
    fresher: true,
    role:"trainee"
  };
  
  console.log(Object.keys(emp1));//> Array ["name", "age", "fresher", "role"]
  //when the keys are numbers then they are taken in increasing order
  const studentList={101:"raj",22:"mohan",7:"kiran",320:"ajay"}
  console.log(Object.keys(studentList));
  //> Array ["7", "22", "101", "320"]
  //getfoo not enumerable
  const myObj = Object.create({}, {
    myval:{
      value:21,
      enumerable:true
    },
    getFoo: function(){
      alert("hello");
    }
  });
    console.log(Object.keys(myObj));// Array ["myval"]