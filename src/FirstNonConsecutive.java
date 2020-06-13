public class FirstNonConsecutive {
    public static Integer find(int[] ints) {
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] != ints[i - 1] + 1) {
                return ints[i];
            }
        }
        return null;
    }
}
