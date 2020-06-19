import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitalRootTest {
    @Test
    public void Tests() {
        assertEquals( 7, DigitalRoot.digital_root(16));
        assertEquals( 6, DigitalRoot.digital_root(456));
    }
}