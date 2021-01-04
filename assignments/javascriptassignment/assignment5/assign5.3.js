var input = document.createElement("p");
var insertedtext = document.createTextNode("This is new.");
input.appendChild(insertedtext );

var element = document.getElementById("divid");
element.appendChild(input);