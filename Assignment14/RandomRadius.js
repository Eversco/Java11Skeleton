let RandomRadiusCanvas = document.querySelector(".RandomRadius");
let RR = RandomRadiusCanvas.getContext("2d");

for (let i = 0; i < 10; i++) {
    xpos = Math.floor((Math.random() * 360) + 20);
    ypos = Math.floor((Math.random() * 360) + 20);
    radius = Math.floor((Math.random() * 20) + 5);// random number for radius
    
    RR.beginPath();
    RR.fillStyle = "blue";
    RR.arc(xpos, ypos, radius, 0, 2*Math.PI);// random radius inserted
    let randomColor = 'hsl(' + 360 * Math.random() + ', 100%, 50%)'; // random color using random number
    RR.fillStyle = randomColor;
    RR.fill();
    RR.closePath();
}