public class EvenOddInArray {
    public static void main(String []args)
    {
        int a[]={2,3,4,5,6,9};
        for(int i=0;i<a.length;i++){
        if(a[i]%2==0)
        {
            System.out.println(a[i]+"is even");
        }
        else
        System.out.println(a[i]+"is odd");
        }
    }
}
