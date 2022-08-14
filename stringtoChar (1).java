import java.util.*;

public class stringtoChar {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.next();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        System.out.println(ch);
      }
  }
}