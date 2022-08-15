import java.util.*;

public class FindAWordPresentInAString {
    public static void main(String[] args) {
      Scanner input=new Scanner (System.in);
      String s=input.nextLine();
      String a[]=s.split(" ");
      boolean flag=false;
      String s1=input.next();
      for(int i=0;i<a.length;i++){
        if(a[i].equals(s1)){
          flag=true;
          break;
        }
      }
      System.out.println(flag);
  }
}