package com.sd.io;

import java.io.*;

public class FileRead {
  public static void main(String[] args) throws
  Exception {
    FileReader fr=new FileReader("test.txt");
    BufferedReader br=new BufferedReader(fr);// �ܾ����
    String s;
    while((s=br.readLine())!=null) {
      System.out.println(s);
    }
    //int i; //���ڴ���
    //while((i=fr.read()) !=-1) {
    //  System.out.println((char)i);
    // }
    fr.close();
  }
}