import java.util.*;

public class FrequencyHashingProgram {
    public static void main(String[] args) {
      String s="thequickbrown";
      int a[]=new int[26];
      for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      int index=ch-'a';
      a[index]=a[index]+1;
      }
      for(int i=0;i<=a.length;i++){
        if(a[i]>0){
       int b=97+i;
          System.out.println("Freq of "+(char)b+": "+a[i]);
        }
          }
    }
}