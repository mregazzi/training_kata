import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WelcomeTest {
    @Test
    public void exampleTest() {
        assertEquals("Welcome", Welcome.greet("english"));
        assertEquals("Welkom", Welcome.greet("dutch"));
        assertEquals("Welcome", Welcome.greet("IP_ADDRESS_INVALID"));
    }
}