import java.util.*;

public class IdealString {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.next();
      char ch[]=s.toCharArray();
      boolean flag=true;
      if(ch[0]>=97 && ch[0]<=122){
        System.out.println("Not Ideal");
        return;
      }else{
        for(int i=1;i<ch.length;i++){
          if(ch[i]>=65 && ch[i]<=90){
            flag=false;
            break;
          }
        }
      }
      if(flag==false){
        System.out.println("Not Ideal");
      }else{
        System.out.println("Ideal");
      }
  }
}