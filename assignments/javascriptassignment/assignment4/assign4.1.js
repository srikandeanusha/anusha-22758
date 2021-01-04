var x = 0;
var array = Array();
function add()
{
 array[x] = document.getElementById("textid").value;
 alert(array[x]+ " Added sucessfully");
 x++;
 document.getElementById("textid").value = "";
}

function display()
{
    var displaytext = "<hr/>";   
    
    for (var i=0; i<array.length; i++)
    {
      displaytext+= array[i] + "<br/>";
    }
    document.getElementById("result").innerHTML = displaytext;
 }
