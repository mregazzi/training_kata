import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATMTest {
    @Test
    public void noNotesLessThatTen() {
        assertEquals(-1, new ATM().solve(9));
    }

    @Test
    public void oneNoteForTenDollars() {
        assertEquals(1, new ATM().solve(10));
    }

    @Test
    public void twoNotesForThirtyDollars() {
        assertEquals(2, new ATM().solve(30));
    }

    @Test
    public void twoNotesFor550(){
        assertEquals(2, new ATM().solve(550));
    }

}
