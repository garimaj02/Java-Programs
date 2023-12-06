import java.util.Scanner;

public class PalindromeNumbere {
    public static void main(String []args){
           int rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=sc.nextInt();
        int org_num=num;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(org_num==rev)
        System.out.println("Number is a palindrome number");
        else
        System.out.println("not a palindrome number");
    }
}
