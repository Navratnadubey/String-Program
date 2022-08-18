import java.util.*;

public class countStringifItInInteger {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.next();
      int sum=0;
      for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
          String s1=s.substring(i,j+1);
          System.out.println(s1);
          int x=Integer.parseInt(s1);
          sum=sum+x;
        }
      }
      System.out.println(sum);
  }
}