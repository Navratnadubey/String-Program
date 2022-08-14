import java.util.*;

public class AlternateReverseString {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.next();
      for(int i=s.length()-1;i>=0;i=i-2){
        char ch=s.charAt(i);
        System.out.println(ch);
      }
  }
}