var character = document.getElementById("characeter");
var block = document.getElementById("block");

 function jump(){
    if(character.classList != "animate"){
        character.classList.add("animate"); //adding animate class to character block
    }

    setTimeout(function(){character.classList.remove("animate")},500); 
    
    var checkDeadEnd = setInterval(() => {
        var characterTop = parseInt(window.getComputedStyle(character).getPropertyValue("top"));

        var blockLeft = parseInt(window.getComputedStyle(block).getPropertyValue("left"));

        if((blockLeft<20 && blockLeft > 0) && (characterTop >=130)){

            block.style.animation = "none";
            block.style.display = "none";
            alert(" u lost");
           
        }
    }, 10);

    

}

function jumpAfterKeyPress(event){

    if(event.key==="Spacebar" || event.key === ' '){
        jump();
    }

}

character.addEventListener("click", jump);
window.addEventListener("keypress", jumpAfterKeyPress); // here window because spacebar will be checked on window i.e global object
