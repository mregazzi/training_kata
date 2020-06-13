import java.util.Arrays;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        if(a.length == 0 || b.length == 0 || a.length != b.length || a == null || b == null){
            return false;
        }

        printArray(a);
        printArray(b);
        Arrays.setAll(a, (index) ->Math.abs(a[index]));
        Arrays.sort(a);
        Arrays.sort(b);
        printArray(a);
        printArray(b);

        for (int i = 0; i < a.length; i++) {
            if(a[i]*a[i] != b[i]){
                return false;
            }
        }
        return true;
    }

    private static void printArray(int[] arr) {
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d; ",arr[i]);
        }
        System.out.println();
    }
}