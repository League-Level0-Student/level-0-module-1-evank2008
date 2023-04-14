
void setup() {
PImage face = loadImage("718smiley.png");
size(512,512);
face.resize(512,512);
image(face,0,0);
}
void draw() {
  fill(mouseX,0,mouseY);
ellipse(330,190,180,180);
ellipse(130,190,180,180);
fill(0,0,0);
ellipse(330,190,40,40);
ellipse(130,190,40,40);
}
