import java.util.Arrays;

public class BinarySearch {
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9};
        int lb=0, ub=a.length-1,ser=3;
   boolean flag=false;
        
        while(lb<=ub)
        {
            int mid=(lb+ub)/2;
        
        if(ser==a[mid])
        {
            System.out.println("element is found ");
            flag=true;
           break;
        }
    
        else if(ser>a[mid])
        {
          lb=mid+1;
        }
        else if(ser<a[mid])
        {
            ub=mid-1;
        
        }
}
if(flag==false)
{
    System.out.println("element not found");
}
// System.out.println(Arrays.binarySearch(a,6));

    }
}
