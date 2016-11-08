class Grade {
   String grade;
  String computeGrade(double marks) {
    if (90<=marks && marks<=100) {
      return grade="A";
      }
    else if (80<=marks && marks<90) {
      return grade="B";
      }
    else if (70<=marks && marks<80) {
      return grade="C";
      }
    else if (60<=marks && marks<70) {
      return grade="D";
      }
    else {
      return grade="F";
      }
    
  }
  public static void main(String[] args) {
    Grade s=new Grade();
    double[] marks={100, 81.5, 71.5, 61.5, 51.5};
   
    for(double m:marks) {
      System.out.printf("You enterd marks grade %c\n",s.computeGrade(m));
    }
    
  }
}