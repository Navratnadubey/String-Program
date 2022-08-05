import java.util.*;

public class occuranceofChar {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.nextLine();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(i==3){
          System.out.print("");
        }else{
          System.out.print(ch);
        }
      }
  }
}