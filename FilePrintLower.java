package com.sd.io;

import java.util.Scanner;

import java.io.*;

class FilePrintLower {
  void fileLower() {
    try {
      BufferedReader br=new BufferedReader(new FileReader(new File("test.txt")));
      String s;
      while ((s=br.readLine()) !=null) {
        System.out.println(s.toLowerCase());
      }
      br.close();
    } catch (IOException e) {
      System.out.println("File None Exist");
    }
    }
    public static void main(String[] args) {
      FilePrintLower fpl=new FilePrintLower();
      fpl.fileLower();
    }
   
  
}