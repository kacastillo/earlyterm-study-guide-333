import java.util.HashMap;
import java.util.HashSet;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }


    // TODO: Implement the other methods from the README AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

    //longest word that starts with a given letter
    public static String longestWordStartingWith(String[] words, char letter) {
        String longest = "";
        for (String word : words) {
           if (word.length() > longest.length() && word.charAt(0) == letter) {
               longest = word;
           }
        }
        return longest;
    }

    //count of odd values 
       public static int oddEvenDiff(HashMap<String, Integer> map) {
        int odd  = 0;
        int even = 0;
        for (int val : map.values()) {
            if (val % 2 == 0) even++;
            else              odd++;
        }
        return Math.abs(odd - even);
    }

    // count words with leng > n and length < m
    public static int countWordsInRange(HashSet<String> words, int n, int m) {
        int count = 0;
        for (String word : words) {
            if (word.length() > n && word.length() < m) {
                count++;
            }
        }
        return count;
    }

    // second largest num - hashset?
    public static int secondLargest(HashSet<Integer> nums) {
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n > largest) {
                secondLargest = largest;
                largest = n;
            } else if (n > secondLargest && n < largest) {
                secondLargest = n;
            }
        }
        return secondLargest;
    }
}
