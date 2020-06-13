import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestFiveDigitNumberTest {
    @Test
    public void exampleTests() {
        Assertions.assertEquals(83910, LargestFiveDigitNumber.solve("283910"));
        Assertions.assertEquals(99999, LargestFiveDigitNumber.solve("1230987634748234098762340587923465203458273460254899999098745079853424567890"));
    }

    private static class LargestFiveDigitNumber {
        public static int solve(String digits) {
            int max = 0;
            for (int i = 0; i < (digits.length() - 4); i++) {
                int num = Integer.parseInt(digits.substring(i, i + 5));
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
    }
}
