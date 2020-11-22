const cards = document.querySelectorAll('.memorycard-container');

let hasFlippedCard = false;
let lockBoard = false;
let firstCard, secondCard, firstCardVal, secondCardVal;

function flipCard(){
    if(lockBoard) return;

    this.classList.add('flip');

    if(!hasFlippedCard){
        hasFlippedCard = true;
        firstCard = this;
        return;
    }
 
        hasFlippedCard = false;
        secondCard = this;
        checkForMatch();
}

function checkForMatch(){
        firstCardVal = firstCard.dataset.food;
        secondCardVal = secondCard.dataset.food;
        let isMatch = firstCardVal === secondCardVal;

        isMatch ? disableCards() : unFlipCards();
       
}

function disableCards(){
    firstCard.removeEventListener('click', flipCard);
    secondCard.removeEventListener('click', flipCard);
}

function unFlipCards(){
    lockBoard = true;
    setTimeout(()=>{
        firstCard.classList.remove('flip');
        secondCard.classList.remove('flip');
        lockBoard = false;
    }, 1000);
}

cards.forEach(card => card.addEventListener('click', flipCard));
