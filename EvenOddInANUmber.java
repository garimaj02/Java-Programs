import java.util.Scanner;

public class EvenOddInANUmber {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int count=0,count1=0;
        while(n>0)
        {
            int rem=n%10;
            if(rem%2==0)
            {
            count++;
            }
            else
            {
             count1++;
            }
             n=n/10;
        }
        
    

        System.out.println("even digits is: "+count);
        System.out.println("odd digits is: "+count1);
    }
}
