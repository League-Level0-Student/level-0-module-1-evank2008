void setup() {
    size(500, 500);
background(100, 100, 255);
}

int color1 = 100;
int color2 = 100;
int color3 = 255;
void draw() {

    noStroke();
    fill(255, 0, 0);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(25, 255, 25);
    rect(176, 103, 12, 32);
    
    if(mousePressed) {
      fill(color1, color2, color3);
    ellipse(80, 200, 30, 30);
    }
}
