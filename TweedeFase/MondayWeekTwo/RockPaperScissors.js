function rockPaperScissors(arg){
  
  const choices = ["rock", "paper", "scissors"]
  
  let pcChoice = choices[Math.floor(Math.random() * 3)];

  let x = document.getElementById("result");
  
  if (arg == pcChoice) {
    x.innerHTML = "It was a Tie";
  } else if (pcChoice == "rock") {
    if (arg == "paper") {
      x.innerHTML = "You lost";
    } else if (arg == "scissors") {
      x.innerHTML = "You won";
    }
  } else if (pcChoice == "paper") {
    if (arg == "rock") {
      x.innerHTML = "You won";
    } else if (arg == "scissors") {
      x.innerHTML = "You lost";
    }
  } else if (pcChoice == "scissors") {
    if (arg == "paper") {
      x.innerHTML = "You won";
    } else if (arg == "rock") {
      x.innerHTML = "You lost";
    }
  }
}