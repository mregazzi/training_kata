import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {
    @ParameterizedTest
    @CsvSource({
            "1997, false",
            "5, false"
    })
    void should_not_be_a_leap_year_if_not_divisible_by_4(int input, boolean output){
        assertFalse(newYear(input).isLeap());
    }

    @Test
    void should_be_a_leap_year_if_divisible_by_4() {
        assertTrue(newYear(1996).isLeap());
    }

    @Test
    void should_be_a_leap_year_if_divisible_by_400(){
        assertTrue(newYear(1600).isLeap());
    }

    @Test
    void should_not_be_a_leap_year_if_divisible_by_100(){
        assertFalse(newYear(1800).isLeap());
    }

    private Year newYear(int input) {
        return new Year(input);
    }
}
