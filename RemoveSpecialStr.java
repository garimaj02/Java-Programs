public class RemoveSpecialStr {
    public static void main(String []args)
    {
        String s="@#%^&* thio90jbhjvngjh";
        s= s.replaceAll("[^a-zA-z0-9]", "");
        System.out.println(s);
    }
}
