var msg; 
msg="The script is located in external script file called math.js"; 
document.write(msg+"<br>"+"<br>");
function addNumbers()
 { 
    var headparam=parseInt(document.getElementById("id1").getAttribute("headparameter"));
    var bodyparam=parseInt(document.getElementById("id2").getAttribute("bodyparameter"));
    var result;
    result=headparam+bodyparam;
    return(document.write("Addition of "+   headparam +"  and" + 
      bodyparam +" is :"+  result));
 }
addNumbers();