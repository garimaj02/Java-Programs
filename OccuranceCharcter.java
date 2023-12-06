import java.util.Scanner;

public class OccuranceCharcter {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enetr a string");
        String str=sc.nextLine();
      int total_count= str.length();
        int count=str.replace("a", "").length(); //occurance of a
        int count1=total_count-count;
        System.out.println(count1);
    }
}
