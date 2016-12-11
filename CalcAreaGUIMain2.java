package com.sd.gui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CalcAreaGUIMain2 extends JFrame implements ActionListener {
  JTextField radiusTF1; // 클래스 스콥, 함수안에는 로컬 스콥
  JTextField areaTF2;
  public CalcAreaGUIMain2() {
    JFrame f=new JFrame();
    JPanel panel=new JPanel(new GridLayout(3,2));
    getContentPane().add(panel);
    JLabel label1=new JLabel("반지름");
    JLabel label2=new JLabel("면적");
    radiusTF1=new JTextField(10);
    areaTF2=new JTextField(10);
    JButton b1=new JButton("계산");
    JButton b2=new JButton("취소");
    b1.setPreferredSize(new Dimension(40, 40));//
    b1.addActionListener(this); //디스는 이거 자체 클래스
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        radiusTF1.setText(" ");
        areaTF2.setText(" ");
        b2.setText("취소됨");
      }
    });
    panel.add(label1);
    panel.add(radiusTF1);
    panel.add(label2);
    panel.add(areaTF2);
    panel.add(b1);
    panel.add(b2);
    //f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);
  }
  public void actionPerformed(ActionEvent e) {
    JButton b=(JButton)e.getSource(); //계산하는 버튼
    Double r=Double.parseDouble(radiusTF1.getText());
    areaTF2.setText(Double.toString(Math.PI*Math.pow(r,2)));
    b.setText("계산끝");
    //JButton be=(JButton)e.getSource();
    
  }
  public static void main(String[] args) {
    CalcAreaGUIMain2 c=new CalcAreaGUIMain2();
    c.setDefaultCloseOperation(EXIT_ON_CLOSE);
    c.pack();
    c.setVisible(true);
  }
}