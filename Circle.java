package com.sd.ch8;
public class Circle extends Point {
  private double radius;
  public double getArea;
  public Circle(int x, int y, int ra) {
    super(x,y);
    this.radius=ra;
  }
  public double getArea() {
    return getArea=radius*radius*Math.PI;
  }
  public static void main(String[] args) {
    Circle c=new Circle(10,10,5);
    double myArea=c.getArea();
    System.out.println(myArea);
  }
}