package com.sd.yut;
//���������� ����=-1,��=0,��=1,��=2,��=3, ��=4, ��=5

public class Yut extends Thread {
  static int number=0;
  static String whichYut;
  public void throwYut() {
    number=(int)(Math.random()*6)-1;
    switch (number) {
      case 0: 
        whichYut = "nak";
        break;
      case 1: 
        whichYut = "do";
        break;
      case 2: 
        whichYut = "ge";
        break;
      case 3: 
        whichYut = "girl";
        break;
      case 4: 
        whichYut = "yut";
        break;
      case 5: 
        whichYut = "mo";
        break;
      default: 
        whichYut = "backdo";
        number=-1;
        break;
    }
    System.out.println("You! "+whichYut+" "+number);
  }
  public int getNum() {
    return this.number;
  }
  public static void main(String[] args) {
    Yut y=new Yut();
    for(int i=0;i<3;i++) {
      y.throwYut();
      
    }
  }
}