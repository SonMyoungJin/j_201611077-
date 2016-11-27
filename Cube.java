package com.sd.ch8;

//import com.sd.ch8.Rectangle;//똑같은 디렉토리에 만들면 필요없다

public class Cube extends Rectangle {
  double height;
  public Cube(double l,double w, double h) {
    super(l,w); //반드시 첫번째줄에 써주자 갖다쓸수있도록
    this.height=h;
  }
  public double getHeight() {
    return this.height;
  }
  public static void main(String[] args) {
    Cube c=new Cube(10.0,20.0,30.0);
    c.getLength();
    c.getHeight();
    c.getWidth();
  }
}