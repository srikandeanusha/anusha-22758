
function dis(val)
{
document.getElementById("display").value+=val
}
function equal()
{
let p = document.getElementById("display").value
let q = eval(p)
document.getElementById("display").value = q
}
function clr() 
{ 
    document.getElementById("display").value = " " 
} 
function backspace() 
{
    var value = document.getElementById("display").value;
    document.getElementById("display").value = value.substr(0, value.length - 1);
}
function sqrt()
{
    let p = document.getElementById("display").value
    let q = Math.sqrt(p)
    document.getElementById("display").value = q
}
function cbrt()
{
    let p = document.getElementById("display").value
    let q =Math.cbrt(p)
    document.getElementById("display").value = q
}
