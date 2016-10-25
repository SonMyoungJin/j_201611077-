package com.sd.turtle;
import ch.aplu.turtle.*;
public class TurtleSquare {
  
  public static void drawSquare(int size) {
    Turtle t1=new Turtle();
      for(int i=0;i<4;i++) {
        t1.forward(size);
        t1.right(90);
      }
  }
  public static void main(String[] args) {
    TurtleSquare t1=new TurtleSquare();
    t1.drawSquare(50);
      
   }
}