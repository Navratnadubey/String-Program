import java.util.*;

public class ReverseAllWordsOfString {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s="My name is Navratna Dubey.";
      String a[]=s.split(" ");
      String temp="";
      for(int i=0;i<a.length;i++){
        String rev="";
        for(int j=a[i].length()-1;j>=0;j--){
          char ch=a[i].charAt(j);
          rev=rev+ch;
        }
        temp=temp+rev+" ";
      }
      System.out.println(temp);
  }
}