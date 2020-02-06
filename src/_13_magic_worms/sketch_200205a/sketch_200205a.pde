int wormX = 0;

void setup() {
  size(600, 600);
  fill((int)random(255), (int)random(255), (int)random(255));
}

void draw() {
  for (int i = 1; i < 300; i = i+1){
    ellipse(random(600), random(600), 10, 10);
  }
}
