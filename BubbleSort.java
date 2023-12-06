import java.util.Arrays;
public class BubbleSort {
    public static void main(String args[])
    {
        int a[]={8,3,4,1,5,8,3,0};
        int temp=0;
        System.out.println("Arrays before sorting"+Arrays.toString(a));
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }
                  System.out.println("Arrays after sorting:"+Arrays.toString(a));  
    }
}
