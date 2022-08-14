import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.next();
      String s1="";
      for(int i=s.length()-1;i>=0;i--){
        char ch=s.charAt(i);
        s1=s1+ch;
      }
      if(s1.equals(s)){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
  }
}