class comEleInThree {
    public static void main(String []args)
    {
        int[] a1={1,2,3,4,5,6,9};
        int[] a2={9,3,4,2,0,2,1};
        int[] a3={2,3,5,1,6,8,6};
        int x=0,y=0,z=0;

        while(x<a1.length && y<a2.length && z<a3.length)
        {
            if(a1[x]==a2[y] && a2[y]==a3[z])
            {
               System.out.println(a1[x]);
               x++;
               y++;
               z++;
            }
            else if(a1[x]>a2[y])
            {
                y++;
            }
            else if(a2[y]>a3[z])
            {
                z++;
            }
            else
            {
                x++;
            }
        }

    }
}
