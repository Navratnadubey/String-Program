import java.util.*;

public class countHowManySubStringInAString {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.next();
      int n=s.length();
      int sum=n*(n+1)/2;
      System.out.println(sum);
  }
}