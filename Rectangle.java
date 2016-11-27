package com.sd.ch8;
public class Rectangle {
  protected double length;
  protected double width;
  protected boolean isSelected;
  public Rectangle(double l, double w) {
    this.length=l;
    this.width=w;
  }
  public double getLength() {
    return this.length;
  }
  public double getWidth() {
    return this.width;
  }
   public boolean getSelected() {
        return this.isSelected;
    }
    public void setSelected(boolean b) {
      this.isSelected=b;
    }
  public static void main(String[] args) {
    Rectangle r=new Rectangle(20.0, 30.0);
    r.getLength();
    //r.setSelected(False);
    r.getSelected();
  }
}