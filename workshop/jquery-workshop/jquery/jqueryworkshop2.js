$(document).ready(function()
{
    $('#show').click(function()
    {
        if($('#pwd').attr('type')==="password")
        {
           $('#pwd').attr("type","text");
        }
        else
        {
            $('#pwd').attr("type","password");
        }
    });
    function ValidateEmail(mail) 
    {
     if (/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/.test(form.email.value))
      {
        return (true)
      }
        alert("You have entered an invalid email address!")
        return (false)
    }
});