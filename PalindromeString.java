import java.util.Scanner;

public class PalindromeString{
public static void main(String []args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string: ");
    String str=sc.nextLine();

    String Org_str=str;
    String rev="";
    int n=str.length();
    for(int i=n-1;i>=0;i--)
    {
        rev=rev+str.charAt(i);
    }
    System.out.println(rev);
    if(Org_str.equals(rev))
    {
        System.out.println("String is a palindrone string");
    }
    else
    System.out.println("Not a palindrome string");
}
}