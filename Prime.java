import java.util.Scanner;

public class Prime {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n>1)
        {
            for(int i=2;i<Math.sqrt(n);i++)
            {
            if(n%i==0)
            System.out.println("not a Prime number");
            else
            System.out.println("prime number");
    
            }
         
        
        }
        else
        System.out.println("not a prime number");
    }
}
