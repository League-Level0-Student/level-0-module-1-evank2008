PImage peproni;

PImage olv;

PImage mroom;

void setup() {
    size(520,520);
    peproni = loadImage("pepperoni.png");
    olv = loadImage("olive.png");
    mroom = loadImage("mushroom.png");
        fill(188,159,84);
ellipse(260,260,500,500);
  fill(222,168,103);
ellipse(260,260,450,450);
}
void draw() {

int xran = (int)random(40,380);
int yran = (int)random(40,380);
image(peproni,xran,yran);
delay(10);
xran = (int)random(40,380);
yran = (int)random(40,380);
image(mroom,xran,yran);
delay(10);
xran = (int)random(40,380);
yran = (int)random(40,380);
image(olv,xran,yran);
delay(10);
//copy paste this three times add 200 ms wait time inbetween each have it repeat indefinitely
}
