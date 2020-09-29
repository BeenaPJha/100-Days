window.addEventListener("load", () => {
    const sounds = document.querySelectorAll(".sounds");
    const taps = document.querySelectorAll(".taps div");
    const visual = document.querySelector(".visuals");
    const color = ["#ada4ad","#56d605","#503000","#7C4C7C","#404E0D","#0d2463"];

    taps.forEach((taps, index) => {
        taps.addEventListener("click",function(){
            sounds[index].currentTime = 0;
            sounds[index].play();
            
            createBubbles(index);
        });
    });

    const createBubbles = (index) => {
        const bubble = document.createElement("div");
        visual.appendChild(bubble);
        bubble.style.backgroundColor = color[index];
        bubble.style.animation = `jump 1s ease`;

        bubble.addEventListener("animationend", function(){
            visual.removeChild(this);
        });
    }

});
