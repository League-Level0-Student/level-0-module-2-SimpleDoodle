// 1. Create three integer variables to represent the x, y, and the size of the ellipse
int x=160;
int y=160;
int e=160;
int r;
int b;
int g;
int d;
int s;
int a;
void setup() {
  // 2. Set the size of your sketch
  size(1000, 1000);
}

void draw() {
 a=(int)random(355);
 s=(int)random(355);
 d=(int)random(355);
  r=(int)random(355);
 b=(int)random(355);
 g=(int)random(355);
 fill(a, s, d);
  // 3. Set the background color of your sketch
  background(r, g, b);
  // 4. Draw an ellipse. Make sure it fits in the window.
  // Use the variables created at the top of the sketch, 
  // for the location and size of your ellipse
  ellipse(x, y, e, e);
}

void mousePressed() {
  //5. Create an integer variable called distance

  //6. Set the value of the distance variable to the value returned by the getDistance method
  //   Pass the mouse's x and y (mouseX and mouseY) and the x and y of your ellipse to the method.
  int distance = getDistance( x, y, mouseX, mouseY);

  //7.  Use an if statement to check if the distance variable is < the radius of the ellipse
  //    If it is, set a new x and y for the ellipse, using a random location on the window
  //    Hint: Use the Processing random() function 
 
  if (distance<e/2) {


 background(r, g, b);
 
 x=(int)random(1000);
 y=(int)random(1000);
 
  }
}

int getDistance(int x1, int y1, int x2, int y2) {
  return (int)Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
}
