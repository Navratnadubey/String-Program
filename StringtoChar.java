import java.util.*;

public class StringtoChar {
    public static void main(String[] args) {
      String s="Hello";
      char ch[]=s.toCharArray();
      for(int i=0;i<s.length();i++){
        System.out.println(ch[i]);
      }
  }
}