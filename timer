
class Timer {
  public int startTime ; // time in msecs that timer started
  public int timeGone ; 
  public boolean running ;
  int tX, tY;

  Timer(int inX, int inY) {
    tX = inX;
    tY = inY;
    running = false ;
    timeGone = 0 ;
  }

  public int currentTime() {
    if ( running ) {
      println("Running in current time: " + (millis()- startTime));
      return ((int)( (millis()- startTime) )) ;
    }
    else {
      println("Not running in current time: " + timeGone);
      return ((int)(timeGone )) ;
    }
  }

  void start() {
    if (!running) {
      running = true ;
      startTime = millis();
    }
  }

  void pause() {
    if (running)
    {
      println("Pause: millis: " + millis() + " " + "startTime: " + startTime);
      timeGone = millis()- startTime ;
      running = false ;
    }
  }

  void DisplayTime() {
    int theTime ;


    theTime = currentTime() ;

    textSize(40);
    text(theTime, tX, tY);
  }
}



//Timer inspired by Leutenegger (2009)
