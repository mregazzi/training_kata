import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripleExampleTests {
    @Test
    public void tests() {
        assertEquals("ttlheoiscstk", TripleExample.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", TripleExample.tripleTrouble("aa","bb","cc"));
        assertEquals("Batman", TripleExample.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", TripleExample.tripleTrouble("LLh","euo","xtr"));
    }
}