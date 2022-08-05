import java.util.*;

public class countVowelConsonantsSpace {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.nextLine();
      int count=0;
      int count1=0;
      int count2=0;
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
          count++;
        }else if(ch==' '){
          count1++;
        }else{
          count2++;
        }
      }
      System.out.println(count);
      System.out.println(count1);
      System.out.println(count2);
  }
}