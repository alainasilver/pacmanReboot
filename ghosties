//ghost class

class Ghost {
  //instance variables
  protected float x; //private means only the ghost knows where it is and can move itself. a new method must be written if others things need to know
  protected float y;
  protected float diffX; 
  protected float diffY; 

  //constructors
  Ghost() {
    x = random(width);
    y = random(height);
    diffX = xPos - x;
    diffY = yPos - y;
  }//end of default contructor 

  //methods - what the ghost can do
  void chase() {
    // figure out how far the player is and move to get closer
    // find the farthest (x or y) and move that way using differences

    diffX = xPos - x; // these variables (diffx and y) are "local variables", they are only available to method chase
    diffY = yPos - y;

    //if ghost is farther away in x direc.
    if (abs(diffX) >= abs(diffY)) {
      // move towards player
      // ghost is to the right AND player is facing right
      if (diffX < 0 && !control[3]) { //exlamation pt is naught operator. means do this when control is FALSE
        x -= ghostspeed;
      }// end if

      else if (diffX > 0 && !control[2]) {
        x+= ghostspeed;
      }
    }//end if

    else {
      if (diffY < 0 && !control[1]) {
        y -= ghostspeed;
      }
      else if (diffY >0 && !control[0]) {
        y+= ghostspeed;
      }
    }//end else


    rect(x, y, 15, 15);
  }//end chase


  void stunned() {

    if (defend[0]) {

      if ((abs(diffX) > 5) && (abs(diffX) <= 30)) { 
        if ( (abs(diffY) > 5) && (abs(diffY) <= 30)) {
          if (millis() - start >= 3000) {
            //if (millis() % 5000 >= 0 && millis() % 5000 <= 200) {

              if (sign <=.5) {

                ghostspeed = 0;
                x = xPos - random(30, 60);
                y = yPos - random(30, 60);
              }
              else {
                ghostspeed = 0;
                x = xPos + random(30, 60);
                y = yPos + random(30, 60);
              }

              if (millis() - start >= 5000) {
                speed = .5;
              }
              ghosties.add(new Ghost());
              score = score + 1;
            //} // millis %
          } // end millis
        } // end if abs
      }
    } // end if defend
  } // end stunned


  /*
  void zapped() {
   if (abs(diffX) <=7 && abs(diffY) <= 7) {
   if (ZAP) {
   if (millis() - start >= 3000) {
   //ghostspeed = 0;
   x = 0;
   y = 0;
   score = score + 1;
   }
   }
   }
   }*/

  void hurt() {

    if (abs(diffX) <= 5 && abs(diffY) <= 5) {

      if (millis() > 10000) {

        x = xPos;
        y = yPos;
        speed = 0;

        pacDeath = true;
        timer.pause();
      } // millis
    }
  }
}//end of ghost class
