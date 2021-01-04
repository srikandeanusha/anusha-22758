var dt=new Date();
document.write(dt+"<br>");
var input=dt.getHours();
if(input<12)
document.write("Good Morning!!!!");
else if(input>=12 && input<=17)
document.write("Good Afternoon!!!!");
else if(input>17)
document.write("Good Evening!!!!");
else
document.write("Good Evening!!!!");

