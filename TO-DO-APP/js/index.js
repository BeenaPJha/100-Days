var inputData = document.getElementById("entry"); // accessing user input here
var button = document.querySelector("button"); // button beside user input
var parentDiv = document.getElementById("display-data"); // The div in which user's entered data will be added

function inputLength(){
    return inputData.value.length;
}


function addData(){
    var listDiv = document.getElementById("list-data");
    var delDiv = document.getElementById("del-data");

    var childDiv = document.createElement("div");
    childDiv.appendChild(document.createTextNode(inputData.value));

    childDiv.addEventListener("click",function(){
        childDiv.classList.toggle("done");
    })

    var deleteBtn = document.createElement("button");
    deleteBtn.appendChild(document.createTextNode("Delete"));
    deleteBtn.setAttribute("id", "del");

    childDiv.appendChild(deleteBtn);

    deleteBtn.addEventListener("click",function(){
        var parentDel = deleteBtn.parentElement;
        parentDel.remove();
    })

    listDiv.appendChild(childDiv);
    parentDiv.appendChild(listDiv);
    inputData.value = "";
}

function addDataAfterClick(){
    if(inputLength()>0){
        addData();
    }
}

function addDataAfterkeyPress(event){
    if(inputLength() > 0 && event.key === "Enter"){
        addData();
    }
}


button.addEventListener("click", addDataAfterClick);
inputData.addEventListener("keypress", addDataAfterkeyPress);