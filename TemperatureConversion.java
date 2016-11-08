import java.util.Scanner;
class TemperatureConversion {
  void conversion(double temp,String sel ) {
     double result;
    if (sel.equals("C")) {
      result= (temp*9/5) +32;
      System.out.println(temp+sel+"-->"+result+"F");
    }
    else if(sel.equals("F")) {
      result=(temp-32)*5/9;
      System.out.println(temp+sel+"-->"+result+"C");
    }
    else {
      System.out.println("User input error!");
    }
    }
  
  
  
  public static void main(String[] args) {
    TemperatureConversion t=new TemperatureConversion();
    t.conversion(32,"F");
    t.conversion(0,"C");
    t.conversion(900,"Z");
  }
}