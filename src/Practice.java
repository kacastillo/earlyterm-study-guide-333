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
}
