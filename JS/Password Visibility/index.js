var pwd = document.querySelector("#password");
var pwdEye = document.querySelector("#togglepwd");
var i = document.querySelector("i");
var type;

pwdEye.addEventListener("click", function(){
    if(pwd.getAttribute("type")==="password"){
        type = "text";
        pwd.setAttribute("type", type);
        i.classList.toggle('fa-eye-slash');
    }
    else{
        type = "password";
        pwd.setAttribute("type", type);
        i.classList.toggle('fa-eye-slash');
    }
})