import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

     @Test // Edge case: all numbers are positive
    void testMaxDiffAllPositive() {
        // Arrange
        int[] numbers = {1, 3, 7, 2};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert — largest: 7, smallest: 1, diff: 6
        assertEquals(6, actual);
    }

     @Test // Edge case: all numbers are negative
    void testMaxDiffAllNegative() {
        // Arrange
        int[] numbers = {-10, -3, -6};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert — largest: -3, smallest: -10, diff: 7
        assertEquals(7, actual);
    }

     @Test // Edge case: all numbers are the same
    void testMaxDiffAllSame() {
        // Arrange
        int[] numbers = {5, 5, 5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert — no spread, diff: 0
        assertEquals(0, actual);
    }

     @Test // Edge case: includes zero
    void testMaxDiffIncludesZero() {
        // Arrange
        int[] numbers = {0, -4, 6};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert — largest: 6, smallest: -4, diff: 10
        assertEquals(10, actual);
    }


    

    // TODO: Make tests for each problem you solve
    

    // ══════════════════════════
    //  longestWordStartingWith
    // ══════════════════════════


     @Test // Normal case: multiple words starting with the letter
    void testLongestWordNormalMatch() {
        // Arrange
        ArrayList<String> words = new ArrayList<>(
         Arrays.asList("apple", "avocado", "banana", "apricot"));

        // Act
        String actual = Practice.longestWordStartingWith(words, 'a');

        // Assert 
        assertEquals("avocado", actual);
    }

    @Test //  case: no words starting with the letter
    void testLongestWordSingleMatch() {
        // Arrange
        ArrayList<String> words = new ArrayList<>(
            
        Arrays.asList("apple", "banana", "cherry"));

        // Act
        String actual = Practice.longestWordStartingWith(words, 'b');

        // Assert 
        assertEquals("banana", actual);
    }

    @Test //empty list (no words to check)
    void testLongestWordEmptyList() {
        // Arrange
        ArrayList<String> words = new ArrayList<>();

        // Act
        String actual = Practice.longestWordStartingWith(words, 'a');

        // Assert — empty list --> nothing to find
        assertEquals("", actual);
    }

     // ══════════════════════════
     //  countWordsInRange
    // ══════════════════════════

     @Test
    void testCountWordsInRangeNormalCase() {
        // Arrange
        HashSet<String> words = new HashSet<>(
                Arrays.asList("hi", "cat", "hello", "elephant", "ok"));
       

        // Act
        int actual = Practice.countWordsInRange(words, 2, 6);

        // Assert 
        assertEquals(2, actual);
    }
     @Test
    void testCountWordsInRangeNoneQualify() {
        // Arrange
        HashSet<String> words = new HashSet<>(Arrays.asList("hi", "ok", "no"));
        // Act
        int actual = Practice.countWordsInRange(words, 5, 10);
        // Assert — all words length 2; none > 5
        assertEquals(0, actual);
    }

    @Test
    void testCountWordsInRangeAllQualify() {
        // Arrange
        HashSet<String> words = new HashSet<>(Arrays.asList("cat", "dog", "hat"));
        // Act
        int actual = Practice.countWordsInRange(words, 2, 4);
        // Assert — all length 3, which is > 2 and < 4
        assertEquals(3, actual);
    }
     // ════════════════════════════════════════════════════════
    // oddEvenDiff
    // ════════════════════════════════════════════════════════

     @Test 
    void testOddEvenDiffAllEven() {
        // Arrange
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        map.put("b", 4);
        map.put("c", 6);
        // Act
        int actual = Practice.oddEvenDiff(map);
        // Assert 
        assertEquals(3, actual);
    }
      @Test
    void testOddEvenDiffAllOdd() {
        // Arrange
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 3);
        // Act
        int actual = Practice.oddEvenDiff(map);
        // Assert 
        assertEquals(2, actual);
    }

     @Test
    void testOddEvenDiffIncludesZero() {
        // Arrange
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 0);  // even
        map.put("b", 1);  // odd
        map.put("c", 3);  // odd
        // Act
        int actual = Practice.oddEvenDiff(map);
        // Assert 
        assertEquals(1, actual);
    }

}


