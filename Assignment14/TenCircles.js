let TenCirclesCanvas = document.querySelector(".TenCircles");
let tenctx = TenCirclesCanvas.getContext("2d");

for (let i = 0; i < 10; i++) {
    tenctx.beginPath();
    tenctx.fillStyle = "green";
    tenctx.arc(TenCirclesCanvas.width/2, (i * 40) + 20, 20, 0, 2*Math.PI);
    tenctx.fill();
    tenctx.closePath();
}