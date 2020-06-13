import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BankAccountTest {

    static final String TOPZERO = " _ ";
    static final String MIDZERO = "| |";
    static final String BOTZERO = "|_|";
    static final String ZERO = TOPZERO+"\n"+MIDZERO+"\n"+BOTZERO+"\n";

    static final String TOPONE = "   ";
    static final String MIDONE = "  |";
    static final String BOTONE = "  |";
    static final String ONE = TOPONE+"\n"+MIDONE+"\n"+BOTONE+"\n";

    static final String TOPTWO = " _";
    static final String MIDTWO = " _|";
    static final String BOTTWO = "|_ ";
    static final String TWO = TOPTWO+"\n"+MIDTWO+"\n"+BOTTWO+"\n";

    public static final String TEN = TOPONE + TOPZERO+"\n" + MIDONE + MIDZERO+"\n" + BOTONE + BOTZERO+"\n";

    @Test
    public void testZeroReturn0() {
        assertEquals(0, BankAccount.parse(ZERO));
    }

    @Test
    public void testSingleDigitReturnNumber() {
        assertEquals(1, BankAccount.parse(ONE));
        assertEquals(2, BankAccount.parse(TWO));
    }

    @Test
    public void testTenReturn10() {
        assertEquals(10, BankAccount.parse(TEN));
    }
}