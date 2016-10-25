package com.sd.turtle;
import ch.aplu.turtle.*;
import java.util.Scanner;
public class TurtleTriangleorSquare {
  Turtle t1=new Turtle();
    //Shape sel=Shape.TRIANGLE;
    int size;
    double sangle;
    double tangle;
  //enum Shape {TRIANGLE, SQUARE}  
    String sel;
  TurtleTriangleorSquare(int size,double sangle,double tangle,String sel){
    this.size = size;
    this.sangle = sangle;
    this.tangle = tangle;
    this.sel = sel;
  }
 void drawTriangleorSquare() {
    switch (sel) {
      case "T":
          for(int i=0;i<3;i++) {
            t1.forward(size);
            t1.right(tangle);
            }
            break;
      case "S":
        for(int i=0;i<4;i++) {
            t1.forward(size);
            t1.right(sangle);
            }
            break;
     }
   }
  public static void main(String[] args) {
    Scanner ssh=new Scanner(System.in); 
    System.out.print("input T Or S : ");
    String shape=ssh.nextLine();
    TurtleTriangleorSquare t2=new TurtleTriangleorSquare(100,90,120,shape);
    t2.drawTriangleorSquare();
   }
}