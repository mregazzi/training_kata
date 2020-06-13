import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class WatermelonTest {

    @Test
    public void basicTests() {
        assertFalse(Kata.divide(2));
        assertTrue(Kata.divide(4));
        assertFalse(Kata.divide(5));
        assertTrue(Kata.divide(6));
    }
}