package com.sd.ch8;

public class RectangleI implements IShape {
  private double width;
  private double height;
  private double area;
  private double perimeter;
  public RectangleI(double w, double h) {
    this.width=w;
    this.height=h;
    this.area=w*h;
    this.perimeter=2*(w+h);
  }
  @Override
  public double calcArea() {
    return this.area;
  }
  @Override
  public double calcPerimeter() {
    return this.perimeter;
  }
  public static void main(String[] args) {
    RectangleI r=new RectangleI(3.0, 4.0);
    System.out.println(r.calcArea());
    System.out.println(r.calcPerimeter());

  }
}