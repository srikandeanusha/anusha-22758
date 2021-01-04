    var inputpara =document.getElementById("pid");
    let para="Cybage Software Pvt Ltd";
    paratrim=para.trim();
    var input=prompt("enter single character to find position"+"<br>")
    if(paratrim.indexOf(input)<0)
    {
        document.write("Character "+ input +" is not found"+"<br>");
    }
    else
    {
        document.write("Character "+ input + " is found at position"+paratrim.indexOf(input)+"<br>");
    }

    document.write(para.concat(' is popularly known as Cybage Software '+"<br>"));
    let upper=para.toLocaleUpperCase();
    let lower=para.toLowerCase();
    document.write(upper+"<br>");
    document.write(lower+"<br>");

    