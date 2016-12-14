package com.sd.yut;

class DicePlayer extends Dice{
  String name=null;
  int num=0;
  public DicePlayer(String _name) { 
    name=_name;
  }
  public void dicePlay() {
    Dice d=new Dice();
    //num=d.roll()
    
    d.roll();
    this.num=d.getNum();
    }
    
  
  public String getName() {
    return this.name;
  }
  public int getNum() {
    return this.num;
  }
  public static void main(String[] args) {
    DicePlayer dp=new DicePlayer("mj");
    dp.dicePlay();
    
  }
}