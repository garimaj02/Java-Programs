import java.util.Arrays;
public class PersonInfo {
    public static void main(String []args)
    {
        String names[]={"p","B","C"};
        String numbers[]={"7899","8976","7854"};
        String str="78";
        Arrays.sort(names);
        
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i].contains(str))
            System.out.println(names[i]);
            break;
        }
    }
}