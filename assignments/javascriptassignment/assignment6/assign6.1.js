var url=window.location.href;
document.addEventListener("dbclick",function changecolor(){
    document.getElementById("pid").style.color="blue";
    location.href='../assignment6/assign6.1.html'
})
document.addEventListener("click",function redirect(){
    location.assign(url);

});