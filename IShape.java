package com.sd.ch8;

public interface IShape {
  public double calcArea(); //자식이 부모가 구현한것을 하나도 어기지 않고 함수의 시그니처만 정해놓?
  public double calcPerimeter();
}