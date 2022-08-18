import java.util.*;

public class PalindromicCountInString {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.nextLine();
      String a[]=s.split(" ");
      int count=0;
      for(int i=0;i<a.length;i++){
        
        String b=a[i];
        int j=0;
        int k=a[i].length()-1;
        while(j<k){
          if(b.charAt(j)==b.charAt(k)){
          count++;
          }
          j++;
          k--;
        }
      }
      System.out.println(count);
  }
}