import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if (maxOccurrences == 0){
            return new int[0];
        }
        List<Integer> intList;
        intList = copyArrayIntoList(elements);
        System.out.println("MAXO="+maxOccurrences);
        printList(intList);

        for (int i1 = 0; i1 < intList.size(); i1++) {
            int n = intList.get(i1);
            int counter = count(n, intList);
            if (counter > maxOccurrences) {
                for (int i = 0; i < counter - maxOccurrences; i++) {
                    remove(n, intList);
                }
            }
        }

        int[] result = new int[intList.size()];
        copyListIntoPrimitiveArray(intList, result);

        //printResult(result);
        return result;

    }

    private static void remove(int n, List<Integer> intList) {
        IntStream.iterate(intList.size() - 1, i -> i >= 0, i -> i - 1).filter(i -> intList.get(i) == n).findFirst().ifPresent(intList::remove);
    }

    private static int count(int n, List<Integer> intList) {
        int counter = (int) intList.stream().mapToInt(e -> e).filter(e -> e == n).count();
        return counter;
    }

    private static void printResult(int[] result) {
        System.out.println();
        for (int n:result) {
            System.out.print(n +" ");
        }
    }

    private static void copyListIntoPrimitiveArray(List<Integer> intList, int[] result) {
        int k = 0;
        for (int n : intList) {
            result[k++] = n;
        }
    }

    private static List<Integer> copyArrayIntoList(int[] elements) {
        List<Integer> intList;
        intList = new ArrayList<Integer>();
        for(int intValue : elements) {
            intList.add(intValue);
        }
        return intList;
    }

    private static void printList(List<Integer> intList) {
        System.out.println("**********LISTA**********");
        for (int n:intList) {
            System.out.print(n +" ");
        }
        System.out.println("**********FINE LISTA**********");
    }

}