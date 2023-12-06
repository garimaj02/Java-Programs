import java.util.Scanner;

public class ReverseWord {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();

        String[] words=str.split(" ");
        String reverseString="";

        for(String w:words)
        {
            String reverseWords="";
            for(int i=w.length()-1;i>=0;i--)
            {
                reverseWords=reverseWords+w.charAt(i);
            }
            reverseString=reverseString+reverseWords+" "; 
        }
        System.out.println(reverseString);
    }
}
