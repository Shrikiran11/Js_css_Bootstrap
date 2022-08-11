const vehicle = ["car", "bike", "tractor","bike","scooty"];
//queue is new Array Iterator object that contains the key/value pairs for each index in the array. 
const queue = vehicle.entries();

for (const x of queue) {
  console.log(x);
}
//op
//> Array [0, "car"]
//> Array [1, "bike"]
//> Array [2, "tractor"]
//> Array [3, "bike"]
//> Array [4, "scooty"]