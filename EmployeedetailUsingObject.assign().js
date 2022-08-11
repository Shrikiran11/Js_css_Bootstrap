const emp1={
    name:"sk",
    interest:"full-stack",
    location:"bangalore"
   };
//Properties in the target object are overwritten by properties in the sources if they have the same key. Later sources' properties overwrite earlier ones. 
const company={
name:"clayfin",
project:"banking",
interest:"backend"};
const project={
location:"chennai",
shift:"general"};
//The Object.assign() method copies all enumerable own properties from one or more source objects to a target object.
const newDetail=Object.assign(emp1,company,project);
console.log(emp1);
//op:
// Object { name: "clayfin", interest: "backend", location: "chennai", project: "banking", shift: "general" }
