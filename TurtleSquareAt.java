package com.sd.turtle;
import ch.aplu.turtle.*;
public class TurtleSquareAt {
  
  public static void drawSquareAt(int size,double x,double y) {
    Turtle t1=new Turtle();
      t1.penUp();
      t1.moveTo(x,y);
      t1.penDown();
      for(int i=0;i<4;i++) {
        t1.forward(size);
        t1.right(90);
      }
  }
  public static void main(String[] args) {
    TurtleSquareAt t1=new TurtleSquareAt();
    t1.drawSquareAt(50,10,10);
      
   }
}