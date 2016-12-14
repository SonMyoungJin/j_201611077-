package com.sd.yut;

import javax.swing.*;

import java.awt.event.*; //for ActionListener

import java.awt.*;

import java.awt.Container;

public class GameGUIMain extends JFrame implements ActionListener{
  DicePlayer p1;
  DicePlayer p2;
  YutPlayer p3;
  YutPlayer p4;
  JTextField scoreTF1;
  JTextField scoreTF2;
  JTextField winnerTF;
  JLabel label1;
  JLabel label2;
  JLabel label3;
  JButton b1;
  JButton b2;
  JButton b3;

  public void CalcGame() {
    JFrame f=new JFrame();
    JPanel panel=new JPanel(new GridLayout(5,2));
    getContentPane().add(panel);
    label1=new JLabel("PlayerA");
    label2=new JLabel("PlayerB");
    label3=new JLabel("winner!!");
    scoreTF1=new JTextField(10);
    scoreTF2=new JTextField(10);
    winnerTF=new JTextField(10);
    b1=new JButton("YutnoriGame");  //윷놀이시작버튼
    b2=new JButton("DiceGame");     //다이스시작버튼
    b3=new JButton("CLEAR!");       //지우기
    b1.setPreferredSize(new Dimension(40,40));
    b1.addActionListener(this);// 확인필요!
    b2.addActionListener(this);
    b3.addActionListener(this);
    
    panel.add(b1);
    panel.add(b2);
    panel.add(label1);
    panel.add(scoreTF1);
    panel.add(label2);
    panel.add(scoreTF2);
    panel.add(label3);
    panel.add(winnerTF);
    panel.add(b3);
    
  }
  public void actionPerformed(ActionEvent e) {
    JButton b=(JButton)e.getSource(); //getSource는 버튼
    if(b==b2) {
      p1=new DicePlayer("PlayerA");
      p2=new DicePlayer("PlayerB");
      
      p1.dicePlay();
      p2.dicePlay();
      
      
      String s1=Integer.toString(p1.getNum());
      String s2=Integer.toString(p2.getNum());
      scoreTF1.setText(s1);
      scoreTF2.setText(s2);
      
      int n1=p1.getNum();
      int n2=p2.getNum();
      
        if (n1>n2) {
          System.out.println("A WON!! B, you LOSE!:)");
          winnerTF.setText(p1.getName());
        }
        else if (n1<n2) {
          System.out.println("A WON!! B, you LOSE!:)");
          winnerTF.setText(p2.getName());
        }
        else if (n1==n2) {
          System.out.println("A,B DRAW!!:)");
          winnerTF.setText("DRAW!");
        }
        
      }
      else if(b==b3) {
        scoreTF1.setText(" ");
        scoreTF2.setText(" ");
        winnerTF.setText(" ");
      }
      else {
        p3=new YutPlayer("PlayerA");
        p4=new YutPlayer("PlayerB");
        
        p3.yutPlay();
        p4.yutPlay();
        String s3=Integer.toString(p3.getNum());
        String s4=Integer.toString(p4.getNum());
        
        scoreTF1.setText(s3);
        scoreTF2.setText(s4);
        
        int n3=p3.getNum();
        int n4=p4.getNum();
        
        
      
        if (n3>n4) {
          System.out.println("A WON!! B, you LOSE!:)");
          winnerTF.setText(p3.get_Name());
        }
        else if (n3<n4) {
          System.out.println("B WON!! A, you LOSE!:)");
          winnerTF.setText(p4.get_Name());
        }
        else if (n3==n4) {
          System.out.println("A,B DRAW!!:)");
          winnerTF.setText("DRAW!");
          
         }
               
       }
       
      }


  public static void main(String[] args) {
    GameGUIMain g=new GameGUIMain();
    g.CalcGame();
    g.setDefaultCloseOperation(EXIT_ON_CLOSE);
    g.pack();
    g.setVisible(true);
  }
}