//The toString() method returns a string representing the object. 
const obj={
    name:"shephard",
    age:21,
    single:true};
  console.log(obj.toString()); //"[object Object]"
  
  const arr=[1,2,3,4,5,6];
  console.log(arr.toString());//"1,2,3,4,5,6"
  console.log((25).toString()); //"25"
  console.log(("full stack devlopment").toString());//"full stack devlopment"
  
  function person(name,age,single){
    this.name=name;
    this.age=age;
    this.single=single;
    
  }
  //constructor to pass values
  const p=new person("kiran",21,true);
  //overriding toString() method
  person.prototype.toString=function(){
   return "name: "+this.name+" age: "+this.age+" single: "+this.single;
  }
  console.log(p.toString());// "name: kiran age: 21 single: true"
  