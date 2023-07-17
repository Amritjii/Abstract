package Patterns;

import processing.core.PApplet;

public class BallOnMobiusStrip extends PApplet {
  
  float t = 0;
  float stripRotation = 0.005f;
  float ballRotation = 0.01f;

  public void settings() {
    size(800, 800, P3D);
  }

  public void setup() {
    colorMode(HSB, 1);
    noStroke();
    fill(1, 0, 1);
  }

  public void draw() {
    background(0);
    translate(width/2, height/2, 0);
    
    // rotate the strip
    rotateY(t * stripRotation);
    
    // draw the strip
    beginShape(TRIANGLE_STRIP);
    for (float i = 0; i <= TWO_PI; i += 0.1) {
      float x = sin(i);
      float y = cos(i);
      float z = sin(i + t);
      vertex(x * 200, y * 200, z * 50);
      vertex(x * 100, y * 100, z * 25);
    }
    endShape();
    
    // rotate the ball
    rotateY(t * ballRotation);
    
    // draw the ball
    pushMatrix();
    translate(0, 0, 40);
    sphere(20);
    popMatrix();
    
    t += 0.01;
  }

  public static void main(String[] args) {
    PApplet.main("BallOnMobiusStrip");
  }
}

