import java.util.HashMap;
import java.util.Map;

public class MissingElementFinder {

    public static int findMissingElement(int[] arr) {
        // Create a map to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Traverse the array and update the frequency map
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Traverse the frequency map to find the missing element
        for (int i = 1; i <= arr.length + 1; i++) {
            if (!frequencyMap.containsKey(i)) {
                return i;
            }
        }

        // This should not happen for a valid input, but return -1 if no missing element is found
        return -1;
    }

    public static void main(String[] args) {
        // Example usage
        int[] input1 = {1, 3, 2, 5, 5};
        int result1 = findMissingElement(input1);
        System.out.println("Missing element: " + result1);  // Output: 4

        int[] input2 = {2, 3, 5, 2, 4};
        int result2 = findMissingElement(input2);
        System.out.println("Missing element: " + result2);  // Output: 1
    }
}

