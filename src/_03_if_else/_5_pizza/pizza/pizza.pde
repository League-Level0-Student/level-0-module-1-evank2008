PImage peproni;

PImage olv;

PImage mroom;

void setup() {
    size(520,520);
    peproni = loadImage("pepperoni.png");
    olv = loadImage("olive.png");
    mroom = loadImage("mushroom.png");
}
void draw() {
    fill(188,159,84);
ellipse(260,260,500,500);
  fill(222,168,103);
ellipse(260,260,450,450);
int xran = (int)random(50,470);
int yran = (int)random(50,470);
image(peproni,xran,yran);
//copy paste this three times add 200 ms wait time inbetween each have it repeat indefinitely
}
