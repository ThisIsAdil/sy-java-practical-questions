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
