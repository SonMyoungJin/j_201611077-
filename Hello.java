package com.sd.ch8;

class Hello {
  String name;
  Hello(String name) {
   this.name=name;
 }
 void sayHello() {
  System.out.println("Hello "+name);
 }
 public static void main(String[] args) {
  Hello[] h=new Hello[5];
  h[0]=new Hello("mj1");
  h[1]=new Hello("mj2");
  h[2]=new Hello("mj3");
  h[3]=new Hello("mj4");
  h[4]=new Hello("mj5");
  
  for(int i=0;i<h.length;i++) {
    h[i].sayHello();
  }
 }
}