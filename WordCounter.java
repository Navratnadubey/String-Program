import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.nextLine();
      String target=input.next();
      String a[]=s.split(" ");
      int count=0;
      for(int i=0;i<a.length;i++){
        if(a[i].equals(target)){
          count++;
        }
      }
      System.out.println(count);
  }
}