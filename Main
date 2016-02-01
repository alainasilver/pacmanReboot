// move rect with arrows
// made Ghost class and rect character
// when you look at a ghost, ghost freezes
// q to teleport, space to freeze, no edges, speed craziness, end screen, music, cant go off edge of screen


float xPos;
float yPos; // allows pac coords to move
float sign; // + or -

float a; // orienter x
float b; // orienter y


float speed;
float bspeed;
float ghostspeed;
float score;
float spacey;

float leech = random (.1, .8 );


boolean[] control; 
boolean[] defend;
boolean[] port;
boolean[] tort;
boolean[] chase;
boolean pacDeath;
boolean reset;
boolean help;
boolean ZAP;




int xDirection = 1;
int yDirection = 1;

int start = millis();




Ghost casper;
Ghost boo;
Ghost inky;
Ghost blinky;
Ghost pinky;
Ghost clyde;

evilGhost meanie; 
evilGhost brutus;

bounceMob bouncy;
bounceMob boing;
bounceMob springy;
bounceMob sproingy; 

Timer timer;


import ddf.minim.*;


Minim minim;//audio context
AudioPlayer player;
AudioPlayer player2;

ArrayList<Ghost> ghosties;

void setup() {
  size(900, 600);
  smooth();
  frameRate(30);

  rectMode(CENTER);

  // ghost spawn pls work
  ghosties = new ArrayList<Ghost>();
  ghosties.add(new Ghost());

  minim = new Minim(this);
  player = minim.loadFile("Portal Reconstructing Science.mp3");
  player2 = minim.loadFile("Bubble Bobble.mp3");

  xPos = random(width);
  yPos = random(height);
  speed = 4;
  ghostspeed = 6;
  bspeed = 3.7;
  a = width/2;
  b = height/2;

  control = new boolean[4]; //{UP, DOWN, LEFT, RIGHT}

  defend = new boolean[1]; //stun

  port = new boolean [1]; // teleport!!!

  tort = new boolean [2]; //meanie speed and teleport

  chase = new boolean [1]; // so end game isnt immediate

  pacDeath = false; // end screen

  reset = false;

  help = false;

  ZAP = false;
  
  spacey = 0;
  score = 0;






  casper = new Ghost(); 
  boo  = new Ghost(); 
  inky = new Ghost(); 
  blinky = new Ghost(); 
  pinky = new Ghost(); 
  clyde = new Ghost();

  meanie = new evilGhost();

  bouncy = new bounceMob();
  boing = new bounceMob();
  springy = new bounceMob();
  sproingy = new bounceMob();

  timer = new Timer(30, 120);
}// end setup 


void draw() {



  if (pacDeath) {

    loadImage("game over.gif");
    //timer.pause();
    background (3, 252, 179);
    textSize(50);
    text("GAME OVER", width/2, height/2);

    textSize(20);
    text("Length of Life:", 30, 70);
    timer.DisplayTime();

    textSize (20);
    text("Number of times defended:", 30, 150);
    text(score, 30, 180);
    text("/10", 100, 180);

    player2.close();
    player.play();

    if (reset) {
      exit();
    }
  }

  else if (millis() <= 4000) {
    //String s = "Arrows keys to move. Space to defend. Q to teleport.";
    textSize(50); 
    text("Arrows keys to move.", width/5, height/7);
    text("Space to defend.", width/4, 2* height/7);
    text("Q to teleport.", width/3, 3* height/7);
    text("The game will begin in a moment.", width/20, 4 * height/7);
    speed = 0;
    ghostspeed = 0;

    xPos = a;
    yPos = b;
  }

  else {

    // int s = second();

    timer.start();
    int m = millis();

   


    background (200, 0, 150); // bg goes here and not in setup so that it refreshes after the rectangle moves
    sign = random(0, 1);
    player2.play();

    textSize(20);
    text(m, width/8, height/8);

    {
      /*minim = new Minim(this);
       player = minim.loadFile("Tavern Brawl  - Dragon Age- Origins Soundtrack.mp3", 2048);
       player.play();
       */
    }

    // dont go off the edges!

    rect(a, b, 1, 1);

    if (xPos >= 0 && xPos <=10 ) {

      xPos = a ;
    }
    else if (xPos >= (width - 10) && xPos <= width) {
      xPos = a;
    }

    if (yPos >= 0 && yPos <=10 ) {

      yPos = b ;
    }
    else if (yPos >= (height - 10) && yPos <= height) {
      yPos = b;
    }


    if (speed<=ghostspeed) {
      textSize(20);
      text("Slow!", width/8, height/8 + 40);
    }

    textSize(20);
    text(speed, width/8, height/8 + 20);





    // end spawn here

    // Q teleport :D
    if (port[0]) {
      xPos = random(width);
      yPos = random(height);
    } 



    if (control[0]) {
      yPos-= speed;
    }
    if (control[1]) {
      yPos+= speed;
    }
    if (control[2]) {
      xPos-= speed;
    }
    if (control[3]) {
      xPos+= speed;
    }
    // moves pac




    if (millis() % 5000 >= 0 && millis() % 5000 <= 200) {
      speed = speed + random(-3, 4);
      println(speed);
    }

    if (millis() % 4000 >= 0 && millis() % 4000 <= 200) {
      ghostspeed = ghostspeed + random(-2, 2);
      println(ghostspeed);
    }


    if (m >= 97000) {
      textSize(15);
      text("You won. Congrats. Stop playing.", width/8 + 20, height/8 + 35);
      player2.close();
    }

    //if(chase[0]){
    casper.chase(); //dot operator. means casper is using method chase
    boo.chase();
    inky.chase();
    blinky.chase();
    pinky.chase();
    clyde.chase();

    //}

    casper.stunned(); 
    boo.stunned();
    inky.stunned();
    blinky.stunned();
    pinky.stunned();
    clyde.stunned();

    casper.hurt(); 
    boo.hurt();
    inky.hurt();
    blinky.hurt();
    pinky.hurt();
    clyde.hurt();

    meanie.evil();
    meanie.hurt();

    bouncy.bounce();
    boing.bounce();

    bouncy.slow();
    boing.slow();

    springy.bounce();
    sproingy.bounce();
    springy.slow();
    sproingy.slow();

    // pls spawn pls pls pls 
    for (int i = ghosties.size()-1; i >= 0; i--) {

      ghosties.get(i).chase();
      ghosties.get(i).hurt();
      ghosties.get(i).stunned();
      //    if (ghosties.get(i).finished()) {
      //      // Items can be deleted with remove().
      //      ghosties.remove(i);
      //    }
    }


    rect(xPos, yPos, 20, 20); // pacman
  } //end else
}//end draw

void mouseDragged() {
  reset = true;
}






void keyPressed() {
  if (keyCode == UP) {
    control[0] = true;
  }
  else if (keyCode == DOWN) {
    control[1] = true;
  }
  else if (keyCode == LEFT) {
    control[2] = true;
  }
  else if (keyCode == RIGHT) {
    control[3] = true;
  }

  else if (key == ' ') {
    //if (millis() % 5000 >= 0 && millis() % 5000 <= 200)
    defend[0] = true;
    tort[1] = true;
    //}
  }
  else if (key == 'q') {
    port[0] = true;
    tort[0] = true; // speed buff to evilghost
  }
  else if (key == 'x') {
    ZAP = true;
  }
}// end key pressed

void keyReleased() {
  if (keyCode == UP) {
    control[0] = false;
  }
  else if (keyCode == DOWN) {
    control[1] = false;
  }
  else if (keyCode == LEFT) {
    control[2] = false;
  }
  else if (keyCode == RIGHT) {
    control[3] = false;
  }
  else if (key == ' ') {
    defend[0] = false;
    tort[1] = false;
  }
  else if (key == 'q') {
    port[0] = false;
    tort[0] = false;
  }
  else if (key == 'x') {
    ZAP = false;
  }
}// end key release
