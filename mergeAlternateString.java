public class mergeAlternateString {
    public static void main(String args[]){
        
        String word1 = "abc" ; 
        String word2 = "pqr" ; 

        // apbqcr

        int p1 = 0, p3 = 0 ; 
        int p2 = word2.length()-1 ; 

        for(int i=0 ; i<word1.length() ; i++){
            for(int j=0 ; j<word2.length() ; j++){
                System.out.println(word1.charAt(p1));
                p1++ ; 
                System.out.println(word2.charAt(p3));
                p3++ ; 
            }
        }
    }
}
