import java.util.*;
public class Pangram{
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    String s="The quick brown fox jumps over the lazy dog.";
    s=s.toLowerCase();
    boolean flag=true;
    for(char ch='a';ch<='z';ch++){
      if(!s.contains(ch+"")){
        flag=false;
      }
    }
    System.out.println(flag);
  }
}