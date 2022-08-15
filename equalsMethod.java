import java.util.*;

public class equalsMethod {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.nextLine();
      String s2=input.next();
      System.out.println(s);
      System.out.println(s2);
        if(s2.equals(s)){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
  }
}