class ReverseWords {
  void reverse(String w) {
    char[] chArr=w.toCharArray();
    StringBuilder olleh=new StringBuilder();
    for(int i=chArr.length-1;i>=0;i--) {
        olleh.append(chArr[i]);
    }
    System.out.println(olleh);
    }
    public static void main(String[] args) {
      ReverseWords rw=new ReverseWords();
      String hello="hello";
      rw.reverse(hello);
    
    }
}