package com.sd.yut;

class YutPlayer extends Yut{
  String name=null;
  int num=0;
  public YutPlayer(String _name) { 
    name=_name;
  }
  public void yutPlay() {
    Yut y=new Yut();
    //num=d.roll()
    
    y.throwYut();
    this.num=y.getNum();
    }
    
  
  public String get_Name() {
    return this.name;
  }
  public int getNum() {
    return this.num;
  }
  public static void main(String[] args) {
    YutPlayer yp=new YutPlayer("mj");
    yp.yutPlay();
    
  }
}