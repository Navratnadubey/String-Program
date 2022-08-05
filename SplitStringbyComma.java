import java.util.*;

public class SplitStringbyComma {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.nextLine();
      for(int i=0;i<s.length();i=i+2){
        char ch=s.charAt(i);
        System.out.println(ch);
      }
  }
}