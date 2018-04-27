let canvas = document.querySelector(".CircleDraw");

let context = canvas.getContext("2d");
context.beginPath();// small file of a cicle
context.arc(200, 200, 50, 0, 2*Math.PI); // Location and size
context.fillStyle = "blue"; // color
context.fill();
context.closePath(); // end file of a circle
context.fillStyle = "white";
context.textAlign = "center"; // Text align
context.font = "30px Georgia"; 
context.fillText("Kevin", canvas.width/2, canvas.height/2); // my name
