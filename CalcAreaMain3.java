package com.sd.io;
import java.util.Scanner;
public class CalcAreaMain3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("반지름을 입력하세요"); //커서앞프롬프터
    double r=sc.nextDouble();
    double area=Math.PI * Math.pow(r,2);
    System.out.printf("반지름:%.2f 면적:%.2f",r,area);
  }

}