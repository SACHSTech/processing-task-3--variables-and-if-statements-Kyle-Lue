import processing.core.PApplet;

public class Sketch extends PApplet {
	float fltCenterX = random(150,width);
  float fltCenterY = random(150,height);
  float fltSize = random(25,250);
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    if(fltCenterX <= 200 && fltCenterY <= 200){
      background(142,222,100);
    }else if(fltCenterX > 200 || fltCenterY > 200){
      background(135, 206, 235);
    }
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {  
    // Creating variables 
    float fltSize2 = fltSize / (float)1.35;
    float fltSize3 = fltSize / (float)2.25;
    float fltSize4 = fltSize / (float)3.25;
    float fltSize5 = fltSize / 8;

    // Creating first circle
    fill(227,66,52);
    ellipse(fltCenterX, fltCenterY, fltSize, fltSize);

    // Creating second circle
    fill(255,255,255);
    ellipse(fltCenterX, fltCenterY, fltSize2, fltSize2);

    // Creating third circle
    fill(227,66,52);
    ellipse(fltCenterX, fltCenterY, fltSize3, fltSize3);

    // Creating fourth circle
    fill(255,255,255);
    ellipse(fltCenterX,fltCenterY, fltSize4, fltSize4);

    // Creating fifth circle
    fill(227,66,52);
    ellipse(fltCenterX,fltCenterY, fltSize5, fltSize5);

    
    // Time
    int intHour = hour();
    int intMin = minute();
    int intSec = second();

    String strTime = intHour + ":" + intMin + ":" + intSec;
  
    // Print out time 
    textSize(20);
    text(strTime, 50, 300);

    noLoop();
  
  }

}