
//evilGhost teleports and spawns new ghosts whenever space is pressed. When Q is pressed, evil ghost gets a speed buff for 6 seconds 



class evilGhost extends Ghost {


  private void evil () {



    if (tort[0]) {

      if (millis() - start >= 3500) {

        ghostspeed= 4 + random(1, 2);
      } // end millis
    } // end if tort

    if (tort[1]) {
      if (sign<=.5) {
        x = xPos - random(20, 50);
        y = yPos - random(20, 50);
      }
      else {
        x = xPos + random(20, 50);
        y = yPos + random(20, 50);
      }
    }
    
    if(defend[0]){
     spacey = spacey + 1;
     if(spacey == 10){
       pacDeath = true;
      timer.pause();
     }
    } 

    rect(x, y, 16, 16, 3);
  }  //end evil
}// end extend
