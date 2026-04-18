import static org.junit.Assert.*;

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

     @Test
    void testMaxDiffAllPositive() {
        // Arrange
        int[] numbers = {1, 3, 7, 2};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert — largest: 7, smallest: 1, diff: 6
        assertEquals(6, actual);
    }

     @Test
    void testMaxDiffAllNegative() {
        // Arrange
        int[] numbers = {-10, -3, -6};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert — largest: -3, smallest: -10, diff: 7
        assertEquals(7, actual);
    }

    

    // TODO: Make tests for each problem you solve
    
}


