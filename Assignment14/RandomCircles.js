let RandomCirclesCanvas = document.querySelector(".RandomCircles");
let Rc = RandomCirclesCanvas.getContext("2d");

for (let i = 10; i > 0; i--) {
let xpos = Math.floor((Math.random() * 360) + 20); // Random Locations for the circles
let ypos = Math.floor((Math.random() * 360) + 20);

Rc.beginPath();
Rc.fillStyle = "orange";
Rc.arc(xpos, ypos, 20, 0, 2*Math.PI); // Location inserted
Rc.stroke();
Rc.closePath();
}