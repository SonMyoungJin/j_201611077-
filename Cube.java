package com.sd.ch8;

//import com.sd.ch8.Rectangle;//�Ȱ��� ���丮�� ����� �ʿ����

public class Cube extends Rectangle {
  double height;
  public Cube(double l,double w, double h) {
    super(l,w); //�ݵ�� ù��°�ٿ� ������ ���پ����ֵ���
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