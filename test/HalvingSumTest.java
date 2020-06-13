import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HalvingSumTest {
    @Test
    public void test1on1() {
        HalvingSum hs = new HalvingSum();
        assertEquals(47, hs.halvingSum2(25));
        assertEquals(247, hs.halvingSum2(127));
    }


    @Test
    public void test() {
        HalvingSum hs = new HalvingSum();
        assertEquals(47, hs.halvingSum(25));
        assertEquals(247, hs.halvingSum(127));
    }
}