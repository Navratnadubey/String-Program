import java.util.*;

public class stringtoCharArray {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.nextLine();

      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        System.out.println(ch);
      }
  }
}