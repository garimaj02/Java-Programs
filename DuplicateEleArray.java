import java.util.HashSet;

public class DuplicateEleArray {
    public static void main(String []args)
    {
        int a[]={9,3,4,3,2,4};
        boolean flag=false;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
            if(a[i]==a[j])
            {
                System.out.println("Duplicate element is:"+a[i]);
                flag = true;
            }
        }
    }
    if(flag==false)
    System.out.println("duplicate element not found");
    }
}
