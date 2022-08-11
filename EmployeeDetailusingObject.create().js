const person = {
    isFresher: false,
    project:"Fullstack",
    days:25,
    printIntroduction: function(){
      console.log(`Employee name is ${this.name} .Iam interested in ${this.interest}. Am I fresher ${this.isFresher}.days pending ${this.days}`)
    },
  };
  
  const me = Object.create(person);
  
  me.name = 'Matthew'; // "name" is a property set on "me", but not on "person"
  me.isHuman = true; // inherited properties can be overwritten
  me.interest="java";
  me.printIntroduction();
  
  console.log(person.hasOwnProperty("interest"));
  console.log(me.hasOwnProperty("interest"));
  
  // expected output: "My name is Matthew. Am I human? true"
  