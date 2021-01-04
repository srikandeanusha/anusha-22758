window.onload = function() {
    var canvas = document.getElementById('mycanvas');
    if (canvas.getContext) 
    {
        var ctx = canvas.getContext('2d');
        
        ctx.fillStyle = "yellow"; 
        ctx.beginPath();
        ctx.arc(75,75,50,0,Math.PI*2,true); 
        ctx.closePath();
        ctx.fill();
        
        ctx.strokeStyle="#2a2a34"; 
        ctx.moveTo(110,75);
        ctx.beginPath();
        ctx.arc(75,75,35,0.15*Math.PI,0.85*Math.PI,false); 
        ctx.stroke();

        ctx.moveTo(65,65);
        ctx.beginPath();
        ctx.arc(60,65,8,0,Math.PI*2,true); 
        ctx.closePath();
        ctx.fillStyle = "black";
        ctx.fill();
        
        ctx.moveTo(95,65);
        ctx.beginPath();
        ctx.arc(90,65,8,0,Math.PI*2,true); 
        ctx.closePath();
        ctx.fillStyle = "black";
        ctx.fill();
    }
}
