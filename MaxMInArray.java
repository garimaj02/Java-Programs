public class MaxMInArray {
    public static void main(String []args){
        int a[]={9,7,5,8,3};
        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            max=a[i];
        }
         for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            min=a[i];
        }
        System.out.println("maximunm number is:"+max+"\nminimum number is:"+min);
    }
}
