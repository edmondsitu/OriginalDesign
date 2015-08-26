import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int rotation = 1;

public void setup()
{
	size(400,400);
}

/*
void draw()
{
	background(150);
 	face();
 	line(100,50,100,150);
}
void face()
{
	fill(200,200,200);
	ellipse(100,100,150,100);
*/


int xPos = 100;
int yPos = 100;
int cxPos = 200;
public void draw() 
{
   background(55, 90, 99);
    //moon
    stroke(55, 90, 99);
    fill(255, 255, 255,90);
    ellipse(370,20,120,120);
    fill(255, 255, 255);
    ellipse(370,20,100,100);
    
    //cloud
    cxPos += 1;
    if(cxPos > 400){
        cxPos = -200;
}

    fill(155, 224, 218);
    stroke(155, 224, 218);
    ellipse(cxPos+98, 60, 106, 87);
    ellipse(cxPos+150, 60, 60, 50);
    ellipse(cxPos+50, 60, 60, 50);
    
    //boat
    xPos += 6;
    if(xPos > 400){
        xPos = -200;
    }
    stroke(0, 0, 0);
    fill(255, 255, 255);
    rect(xPos + 70,yPos + 120,25,20);
    rect(xPos + 95,yPos + 110,25,30);
    rect(xPos + 125,yPos + 90,7,50);
    fill(187, 255, 0);
    ellipse(xPos + 129,yPos + 84,15,15);
    fill(10, 255, 196);
    beginShape();
    vertex(xPos + 60,yPos + 140);
    vertex(xPos + 140,yPos + 140);
    vertex(xPos + 150,yPos + 170);
    vertex(xPos + 190,yPos + 150);
    vertex(xPos + 200,yPos + 190);
    vertex(xPos + 170,yPos + 210);
    vertex(xPos + 10,yPos + 210);
    vertex(xPos + 30,yPos + 170);
    vertex(xPos + 50,yPos + 168);
    vertex(xPos + 60,yPos + 140);
    endShape(); 
    //ocean
    stroke(55, 90, 99);
    fill(37, 153, 173);
    rect(0,310,400,130);
};
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
