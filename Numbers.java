import java.util.ArrayList;
class Numbers {
  ArrayList<Integer> myList = new ArrayList<Integer>();
  Numbers(){};
    int i;
    public void setNumber() {
      for(int j=0;j<1001;j++) {
        if( i%4==0 && i%5!=0) {
          myList.add(i);
        }
       }
     }
    int sumList() {
      int sum=0;
      for(int j:myList){
        sum+=j;
      }
      return sum;
    }
     
  }
  public static void main(String[] args) {
   Numbers num=new Numbers();
   num.setNumber();
   System.out.println("sum: ",num.sumList);
  }
}