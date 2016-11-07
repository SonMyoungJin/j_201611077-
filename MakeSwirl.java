import ch.aplu.turtle.*;
public class MakeSwirl {
  public static void makeSwirlSquare(int size,int bigger,int turns,double degree) {
    Turtle t1=new Turtle();
    t1.clear();
    for(int i=0;i<turns;i++) {
      if(i%2!=0) {
        size+=bigger;
       }
      t1.forward(size);
      t1.right(degree);
     }
     }
  public static void main(String[] args) {
  
    makeSwirlSquare(5,15,20,90.0);
    }
    }