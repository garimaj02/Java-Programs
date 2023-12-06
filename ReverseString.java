import java.util.Scanner;

public class ReverseString {
    public static void main(String []args){
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter String");
         String str=sc.nextLine();
         String rev="";
         int n=str.length();
        //  for(int i=n-1;i>=0;i--){
        //     rev=rev+str.charAt(i);
        //  }
       
        // StringBuffer sb=new StringBuffer(str);
        //  StringBuffer rev=sb.reverse();
        
        char a[]=str.toCharArray();
        for(int i=n-1;i>=0;i--){
            rev=rev+a[i];
          }
 System.out.println(rev);
    }
    
}
