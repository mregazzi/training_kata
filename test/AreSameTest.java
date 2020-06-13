import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AreSameTest {

    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, AreSame.comp(a, b));
    }

    @Test
    public void test2() {
        int[] a = new int[]{2, 2, 3};
        int[] b = new int[]{4, 9, 9};
        assertEquals(false, AreSame.comp(a, b));
    }

    @Test
    public void test3() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 36100, 25921, 361, 20736, 361};
        assertEquals(false, AreSame.comp(a, b));
    }

    @Test
    public void test4() {
        int[] a = new int[]{0, -14, 191, 161, 19, 144, 195, 1, 2};
        int[] b = new int[]{1, 0, 196, 36481, 25921, 361, 20736, 38025, 3};
        assertEquals(false, AreSame.comp(a, b));
    }
}