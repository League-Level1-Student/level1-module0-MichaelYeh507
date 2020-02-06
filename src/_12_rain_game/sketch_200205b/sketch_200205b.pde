int rainDropY = 0;
int randomNumber;
int score;
int speed = 10;
boolean dropletCaught = true;


void setup() {
  size(600, 600);
}

void draw () {
  background (#0A0A0A);
  fill(#036DFF);
  stroke(#036DFF);
  ellipse(randomNumber, rainDropY, 10, 10);
  rainDropY += speed;
  if (rainDropY >= 600){
    checkCatch(randomNumber);
    rainDropY = 0;
    dropletCaught = false;
    randomNumber = round(random(600));
  }
  rect(mouseX, 550, 20, 20);
  fill(#FFD603);
  textSize(16);
  text("Score: " + score, 20, 20);
}

void checkCatch(int x){
  if (x > mouseX && x < mouseX+100)
    score++;
  else if (score > 0) 
     score--;
  println("Your score is now: " + score);
  }
  
  
  
