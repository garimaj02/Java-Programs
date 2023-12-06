import java.util.Arrays;

public class ArrayPos {
    public static void main(String[] args) {
        int a[] = {3, 8, 4, 2, 6, 9};
        int val = 6;
        int pos = 0, pos1 = 0;
        
        for (int i = 0; i < a.length; i++) {
            if (val == a[i]) {
                pos=i;
            }
            
        }
        System.out.println(pos);
      
        Arrays.sort(a);
        
        for (int i = 0; i < a.length; i++) {
            if (val == a[i]) {
                pos1=i;
            }
        }
        System.out.println(pos1);
        
        int diff = pos - pos1;
        System.out.println(diff);
    }
}
