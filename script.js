// 9-Programs on Java script Operators, Comparisons, Statements, Loops, Events, Objects.

// Operators
console.log("Operators:");
let a = 10,
  b = 5;
console.log("Addition: " + (a + b));
console.log("Subtraction: " + (a - b));
console.log("Multiplication: " + a * b);
console.log("Division: " + a / b);

console.log("Comparison Operators:");
// Comparisons
console.log("a == b: " + (a == b));
console.log("a != b: " + (a != b));
console.log("a > b: " + (a > b));
console.log("a < b: " + (a < b));
console.log("a >= b: " + (a >= b));
console.log("a <= b: " + (a <= b));

console.log("Statements:");
// Statements
if (a > b) {
  console.log("a is greater than b");
} else {
  console.log("b is greater than a");
}

console.log("Loops:");
// Loops
for (let i = 0; i < 5; i++) {
  console.log("Loop iteration: " + i);
}

console.log("Click Event:");
// Events
document.getElementById("alertButton").addEventListener("click", function () {
  alert("Alert Button clicked!");
});

console.log("Objects:");
// Objects
const person = {
  name: "Adil Shaikh",
  age: 19,
  sayHello: function () {
    console.log("Hello, my name is " + this.name);
  },
};
person.sayHello();

// 10-Programs on Java script client side scripting with it’s example.
console.log("Programs on Java script client side scripting with it’s example.");

const boxes = document.getElementsByClassName("box");
Array.from(boxes).forEach((box) =>
  box.addEventListener(
    "click",
    (e) =>
      (document.body.style.backgroundColor = e.target.attributes.color.value)
  )
);
