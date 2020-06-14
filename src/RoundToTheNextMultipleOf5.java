public class RoundToTheNextMultipleOf5 {
    public static int roundToNext5(int i) {
        if (i > 0) {
            return i % 5 == 0 ? i : i + (5 - (i % 5));
        } else {
            return (i % 5 == 0) ? i : (i + ((Math.abs(i % 5))));
        }
    }
}
