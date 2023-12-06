import java.util.Scanner;
public class ReverseNumber {
    public static void main(String []args){
        //   int rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=sc.nextInt();
        // while(num!=0){
        //     rev=rev*10+num%10;
        //     num=num/10;
        // }

        // logic2 -> using stringBuffer
        // StringBuffer sb=new StringBuffer(String.valueOf(num));
        // StringBuffer rev=sb.reverse();
        
        // logic3-> using StringBuilder
        StringBuilder sb=new StringBuilder();
        sb.append(num);
        StringBuilder rev=sb.reverse();

        System.out.println(rev);
    }
}
