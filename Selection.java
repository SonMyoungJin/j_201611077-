package com.sd.ch8;
import java.util.ArrayList;
//연관관계로 쓸거야 상속안할거야
public class Selection {     //가시성 정하기
  ArrayList<Rectangle> sArr=new ArrayList<Rectangle>();
  public Selection() {}
  public void select(Rectangle r) {     //기록?
    r.setSelected(true);
    sArr.add(r);
    System.out.println("selected " + r.getSelected());
  }  
  public void print() {
    for(Rectangle r:sArr) {
      System.out.println(r.toString());
    }
  }
  public static void main(String[] args) {
    Rectangle r=new Rectangle(10.0,20.0);
    Selection s=new Selection();
    s.print();
    s.select(r);
  }
}