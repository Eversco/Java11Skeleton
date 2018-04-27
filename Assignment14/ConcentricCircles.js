let ConcentricCirclesCanvas = document.querySelector(".ConcentricCircles");
let CC = ConcentricCirclesCanvas.getContext("2d");

for (let i = 10; i > 0; i--){ // more cicles
    CC.beginPath();
    CC.arc(ConcentricCirclesCanvas.width/2, ConcentricCirclesCanvas.height/2, (20*i), 0, 2*Math.PI);
    CC.stroke();
    CC.closePath();
}