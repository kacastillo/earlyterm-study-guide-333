import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

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
    

    // longestwordstartingwith tests

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


}


