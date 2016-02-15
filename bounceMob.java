

class bounceMob {
  private float xB; //EVIL MUAHAHAHHAHAHHAHAHHAHAHA  real funny haha
  private float yB; 
  private float diffBX;
  private float diffBY;

  bounceMob() {
    xB = random(width);
    yB = random(height);
    diffBX = xPos - xB;
    diffBY = yPos - yB;
  } // end bounceMob

  void bounce () {

    xB = xB + ( bspeed * xDirection );
    yB = yB + ( bspeed * yDirection );

    if (xB > width-(25/2) || xB < (25/2)) {
      xDirection *= -1;
    }
    if (yB > height-(25/2) || yB < (25/2)) {
      yDirection *= -1;
      println("Ollo");
    }

    rect(xB, yB, 16, 16);

    // arc(xB, yB, 25, 25, 0, PIE, 0);
  } // end void bounce

  void slow () {
    if ((abs(diffBX) <= 10) && (abs(diffBY) <= 10)) {
      if (millis() - start >= 2000) {
        speed = 3*leech;
        println("slooow");
      }
    }
  }
} // end class
