const names = ["alok","kamal",["prab"], ["kishore"],"lucky", []];

const email = names.flatMap(str => str+"@gmail.com");

console.log(email);
//> Array ["alok@gmail.com", "kamal@gmail.com", "prab@gmail.com", "kishore@gmail.com", "lucky@gmail.com", "@gmail.com"]
