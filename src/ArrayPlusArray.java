import java.util.stream.IntStream;

public class ArrayPlusArray {
    public static int arrayPlusArray(int[] ints, int[] ints1) {
        return IntStream.of(ints).sum() + IntStream.of(ints1).sum();
    }
}
