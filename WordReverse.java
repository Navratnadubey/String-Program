import java.util.*;

public class WordReverse {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.nextLine();
      String a[]=s.split(" ");
      for(int i=a.length-1;i>=0;i--){
        System.out.print(a[i]+" ");
      }
  }
}