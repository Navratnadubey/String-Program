import java.util.*;

public class PrintAReverseofSpecificSubStringInaString {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s=input.nextLine();
      String target=input.next();
      String temp="";
      String a[]=s.split(" ");
      for(int i=0;i<a.length;i++){
        if(a[i].equals(target)){
          String rev="";
          for(int j=a[i].length()-1;j>=0;j--){
            char ch=a[i].charAt(j);
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

