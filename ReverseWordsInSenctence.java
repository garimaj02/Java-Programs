public class ReverseWordsInSenctence {
        public static void main(String[] args) {
            String sentence = "Hello world, how are you?";
            String reversedSentence = reverseWords(sentence);
            System.out.println(reversedSentence);
        }
    
        public static String reverseWords(String sentence) {
            String[] words = sentence.split(" ");
            StringBuilder reversedBuilder = new StringBuilder();
    
            for (int i = words.length - 1; i >= 0; i--) {
                reversedBuilder.append(words[i]).append(" ");
            }
    
            return reversedBuilder.toString().trim();
        }
    }
    

