import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.nextLine();
      String s1[]=s.split(" ");
      int count=0;
      for(int i=0;i<s1.length;i++){
        count++;
      }
      System.out.println(count);
  }
}