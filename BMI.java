class BMI {
  float computeBMI(float height,float weight){
    float bmi=(float) weight/(height*height);
    System.out.println(bmi);
    if (bmi<=18.5) {
      System.out.println("Low");
    }
    else if(18.5<bmi && bmi<23){
      System.out.println("Normal");
    }
    else if(23<=bmi && bmi<25){
      System.out.println("Risky");
    }
    else if(25<=bmi && bmi<30){
      System.out.println("Obesity1");
    }
    else if(30<=bmi && bmi<40){
      System.out.println("Obesity2");
    }
    else if(bmi>40){
      System.out.println("Obesity3");
    }
    else {
      System.out.println("Error");
    }
  }
  public static void main(String[] args) {
    computeBMI(1.7,75);
  }
}