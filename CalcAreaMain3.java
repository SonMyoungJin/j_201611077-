package com.sd.io;
import java.util.Scanner;
public class CalcAreaMain3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("�������� �Է��ϼ���"); //Ŀ������������
    double r=sc.nextDouble();
    double area=Math.PI * Math.pow(r,2);
    System.out.printf("������:%.2f ����:%.2f",r,area);
  }

}