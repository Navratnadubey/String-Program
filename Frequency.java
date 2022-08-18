import java.util.*;

public class Frequency {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.next();
      int a[]=new int[26];
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        int index=ch-'a';
        a[index]=a[index]+1;
      }
      for(int i=0;i<a.length;i++){
        if(a[i]>0){
        int n=65+i;
        System.out.println("Freq of "+(char)n+" is :"+a[i]);
        }
      }
  }
}