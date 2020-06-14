import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoundToTheNextMultipleOf5Test {

    @Test
    public void basicTests() {
        int[][] arr = {
                {0, 0},
                {1, 5},
                {3, 5},
                {5, 5},
                {7, 10},
                {39, 40}
        };
        assertEquals(0, RoundToTheNextMultipleOf5.roundToNext5(0));
        assertEquals(5, RoundToTheNextMultipleOf5.roundToNext5(5));
        assertEquals(10, RoundToTheNextMultipleOf5.roundToNext5(10));
        assertEquals(100, RoundToTheNextMultipleOf5.roundToNext5(100));
        assertEquals(5, RoundToTheNextMultipleOf5.roundToNext5(3));
        assertEquals(10, RoundToTheNextMultipleOf5.roundToNext5(7));
        assertEquals(5, RoundToTheNextMultipleOf5.roundToNext5(1));
        assertEquals(-5, RoundToTheNextMultipleOf5.roundToNext5(-5));
        assertEquals(-10, RoundToTheNextMultipleOf5.roundToNext5(-11));
        assertEquals(0, RoundToTheNextMultipleOf5.roundToNext5(-2));


    }


}
