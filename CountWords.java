import java.util.*;

public class CountWords {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String s=input.nextLine();
    int count=1;
    for(int i=0;i<s.length();i++){
      char c=s.charAt(i);
      if(c==' '){
        count++;
      }
    }
    System.out.println(count);
  }
}