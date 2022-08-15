import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.next();
      String s1="";
      for(int i=s.length()-1;i>=0;i--){
        char ch=s.charAt(i);
        s1=s1+ch;
      }
      System.out.println(s);
      System.out.println(s1);
      if(s1.equals(s)){
        System.out.println("Palindrome");
      }else{
        System.out.println("Not a Palindrome");
      }
  }
}