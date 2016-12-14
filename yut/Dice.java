package com.sd.yut;

class Dice {
  int number=0;
  public void roll() {
    number=(int)(Math.random()*6)+1;
    System.out.println("turns on "+number);
  }
  public int getNum() {
    return this.number; //Player에서 주사위 값을 가져오도록
  }
  public static void main(String[] args) {
    Dice d=new Dice();
    for(int i=0;i<3;i++) {
      d.roll();
    }
  }
}