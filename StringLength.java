import java.util.*;

public class StringLength {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.next();
      if(s.length()%3==0){
        System.out.println("Yes");
      }else{
       System.out.println("No"); 
      }
    }
}