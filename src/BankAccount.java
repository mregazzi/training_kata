public class BankAccount {
    static final String TOPZERO = " _ ";
    static final String MIDZERO = "| |";
    static final String BOTZERO = "|_|";
    //static final String ZERO = TOPZERO + "\n" + MIDZERO + "\n" + BOTZERO + "\n";
    static final String ZERO = TOPZERO + MIDZERO + BOTZERO;

    static final String TOPONE = "   ";
    static final String MIDONE = "  |";
    static final String BOTONE = "  |";
    static final String ONE = TOPONE + "\n" + MIDONE + "\n" + BOTONE + "\n";

    static final String TOPTWO = " _";
    static final String MIDTWO = " _|";
    static final String BOTTWO = "|_ ";
    static final String TWO = TOPTWO + "\n" + MIDTWO + "\n" + BOTTWO + "\n";

    static final String TOPTHREE = " _";
    static final String MIDTHREE = " _|";
    static final String BOTTHREE = " _|";
    static final String THREE = TOPTHREE + "\n" + MIDTHREE + "\n" + BOTTHREE + "\n";

    public static final String TEN = TOPONE + TOPZERO + "\n" + MIDONE + MIDZERO + "\n" + BOTONE + BOTZERO + "\n";

    public static long parse(final String acctNbr) {
        System.out.println(acctNbr.length() / 9);
        System.out.println(TEN);
        StringBuffer sb = new StringBuffer();
        String[] barArray = acctNbr.split("\n");
        for (var s : barArray) {
            System.out.println(s.substring(3));
            sb.append(s.substring(3));
        }
        System.out.println(sb.toString());
        if (ZERO.equals(sb.toString())){
            System.out.println("Sono UGUALI!!!");
        }
        if (acctNbr.equals(ONE)) {
            return 1L;
        }
        if (acctNbr.equals(TWO)) {
            return 2L;
        }
        return 0L;
    }
}
