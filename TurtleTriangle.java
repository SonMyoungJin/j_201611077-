package com.sd.turtle;
import ch.aplu.turtle.*;
public class TurtleTriangle {
  
  public static void drawTriangle(int size) {
    Turtle t1=new Turtle();
      for(int i=0;i<3;i++) {
        t1.forward(size);
        t1.right(120);
      }
  }
  public static void main(String[] args) {
    TurtleTriangle t1=new TurtleTriangle();
    t1.drawTriangle(50);
      
   }
}