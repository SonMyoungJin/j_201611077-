import java.util.*;

class CountWord {
  Map<String,Integer> wc=new HashMap<String,Integer>();
  
  void wordcount(char[] letters) {
    String f;
    
    for(char c:letters) {
      f=Character.toString(c);
      if(wc.containsKey(f)) {
        wc.put(f,wc.get(f)+1);
        }
       else {
        wc.put(f,1);
       }
      System.out.println(wc);
    }
  }
  public static void main(String[] args) {
    char[] letters="sangmyung university".toCharArray();
    CountWord cw=new CountWord();
    cw.wordcount(letters);
  }
}