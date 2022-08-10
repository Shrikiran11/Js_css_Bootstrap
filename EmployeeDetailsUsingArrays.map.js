//array of objects with keys as Name and yearOfPass
const Employee= [
    { Name:"Shrikiran",yearOfPass:2022},
    { Name:"Devdata",yearOfPass:2022},
    { Name:"kishore",yearOfPass:2021},
  ];
  //The forEach() method calls a function for each element in an array.
  //taking the value of Name key and assigning it as key for EmployeeDetails.
  const EmployeeDetails =Employee.map(({Name,yearOfPass}) => ({ [Name]: yearOfPass }));
  //original array remains unchanged
  console.log(Employee);
  //created new arr using Arrays.Prototype.Map()
  console.log(EmployeeDetails);