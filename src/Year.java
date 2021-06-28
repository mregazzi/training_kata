public class Year {
    private final int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isLeap() {
        return divisibleBy(4) && !(divisibleBy(100) && !(divisibleBy(400)));
    }

    private boolean divisibleBy(int num) {
        return year % num == 0;
    }
}
