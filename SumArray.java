public class SumArray {
    public static void main(String []args)
    {
        int a[]={1,3,6,9,4};
        int sum=0;
        // for(int i=0;i<a.length;i++)
        // {
        //      sum=sum+a[i];
        // }
        // using enhanced for loop
        for(int value: a)
        {
            sum=sum+value;
        }
        System.out.println(sum);
    }
}
