package com.sd.turtle;
import ch.aplu.turtle.*;
public class TurtleStar {
  
  public static void drawStar(int size) {
    Turtle t1=new Turtle();
      for(int i=0;i<5;i++) {
        t1.forward(size);
        t1.left(36);
        t1.forward(size);
        t1.right(108);
      }
  }
  public static void main(String[] args) {
    TurtleStar t1=new TurtleStar();
    t1.drawStar(50);
      
   }
}