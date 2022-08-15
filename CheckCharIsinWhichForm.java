import java.util.*;

public class CheckCharIsinWhichForm {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      char ch='@';
      if(Character.isUpperCase(ch)){
        System.out.println("Uppercase");
      }else if(Character.isLowerCase(ch)){
        System.out.println("LowerCase");
      }else if(Character.isDigit(ch)){
        System.out.println("Digit");
      }else{
        System.out.println("Special Character");
      }
  }
}