import java.util.*;

public class stringReverse {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.nextLine();
      for(int i=s.length()-1;i>=0;i--){
        char ch=s.charAt(i);
        System.out.println(ch);
      }
  }
}