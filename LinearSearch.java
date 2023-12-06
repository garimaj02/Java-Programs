public class LinearSearch {
    public static void main(String []args)
    {
        int a[]={4,3,5,1,6,8};
        int ser=8,flag=0;
        for(int i=0;i<a.length;i++)
        {
           if(a[i]==ser)
           {
            System.out.println("element found in index "+i);
            flag=1;
            break;
           }
        }
        if(flag==0)
        System.out.println("element not found in array");
       
    }
}
