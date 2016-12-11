package com.sd.io;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class PrintFileT {
  public void print()  {
    try {
    File f=new File("noname.txt");
    FileReader fr=new FileReader(f);
    fr.close();
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("File None Exist");
    }
    
  }
  public static void main(String[] args) {
    PrintFileT pft=new PrintFileT();
    pft.print();
  }
}