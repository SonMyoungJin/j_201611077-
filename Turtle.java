package com.sd.ch8;
public class Turtle {         //파일마다 하나의 클래스가 사용되니까 public해줌
  private int nLimbs=4;
  protected String food;
  public void setFood(String f) {
    this.food=f;
  }
  public void eat() {
    System.out.print("Turtle eats "+food);
  }
  
}