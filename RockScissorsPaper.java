class RockScissorsPaper {
  void rsp(String a, String b) {
    if((a.equals("r") && b.equals("s")) || (a.equals("s") && b.equals("p")) ||(a.equals("p") && b.equals("r"))) {
        System.out.println("a won!");
      }
    else if((a.equals("r") && b.equals("p")) || (a.equals("s") && b.equals("r")) ||(a.equals("p") && b.equals("s"))) {
        System.out.println("b won!");
      }
    else if((a.equals("r") && b.equals("r")) || (a.equals("s") && b.equals("s")) ||(a.equals("p") && b.equals("p"))) {
        System.out.println("Draw!");
      }
     else{
        System.out.println("Error!!");
      }
    }
    public static void main(String[] args) {
      RockScissorsPaper run=new RockScissorsPaper();
      run.rsp("r","s");
      run.rsp("r","p");
      run.rsp("r","r");
    }
  }