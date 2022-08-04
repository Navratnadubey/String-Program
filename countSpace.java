import java.util.*;

public class countSpace {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.nextLine();
      int count=0;
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch==' '){
          count++;
        }
      }
      System.out.println(count);
  }
}