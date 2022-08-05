import java.util.*;

public class VowelFromString {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.nextLine();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
          System.out.println(ch);
        }
      }
  }
}