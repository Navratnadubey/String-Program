import java.util.*;
public class ReverseAStringSpecificWord{
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    String s=input.nextLine();
    String s1=input.next();
    String temp="";
    String a[]=s.split(" ");
    for(int i=0;i<a.length;i++){
      if(a[i].equals(s1)){
        s1=a[i];
        String rev="";
        for(int j=s1.length()-1;j>=0;j--){
          char ch=s1.charAt(j);
          rev=rev+ch;
        }
        temp=temp+rev+" ";
      }else{
        temp=temp+a[i]+" ";
      }
    }
    System.out.println(temp);
  }
}