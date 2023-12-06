public class MissingNumberArray {
    public static void main(String args[])
    {
        int a[]={1,2,3,5};
        int sum=0,sum1=0;
        for(int i=0;i<a.length;i++)
        {
           sum=sum+a[i];
        }
        // System.out.println(sum);
        for(int i=0;i<=5;i++)
        {
            sum1=sum1+i;
        }
        int diff=sum1-sum;
        System.out.println("Missing number is: "+diff);
    }
}
