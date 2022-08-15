import java.util.*;
public class ReverseAStringAllWord{
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    String s=input.nextLine();
    String temp="";
    String a[]=s.split(" ");
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