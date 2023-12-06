import java.util.Scanner;

public class Fact {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int fact=1;
        // while(n>1)
        // {
        //     fact*=n;
        //     n--;
        // }
        for(int i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
