import java.util.*;

public class StringinUpperOrLowercase {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String s=input.nextLine();
    char ch=s.charAt(0);
    if(ch>=65 && ch<=90){
      System.out.println("Uppercase");
    }else if(ch>=97 && ch<=122){
      System.out.println("Lowercase");
    }else{
      System.out.println("Special character");
    }
  }
}