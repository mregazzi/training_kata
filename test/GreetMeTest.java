import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetMeTest {
    @Test
    public void appendEsclamationPoint() {
        assertEquals("Hello Riley!", GreetMe.greet("Riley"));
    }

    @Test
    public void capitalizeLower() {
        assertEquals("Hello Riley!", GreetMe.greet("riley"));
    }

    @Test
    public void capitalizeAllUpper() {
        assertEquals("Hello Riley!", GreetMe.greet("RILEY"));
    }
}