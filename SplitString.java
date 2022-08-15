import java.util.*;
public class SplitString{
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    String s=input.nextLine();
    String s1[]=s.split(" ");
    for(int i=0;i<s1.length;i++){
      System.out.println(s1[i]);
    }
  }
}