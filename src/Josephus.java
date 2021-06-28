import java.util.ArrayList;
import java.util.List;

public class Josephus {

    static List newList;

    //1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    public static List josephusPermutation(ArrayList arrayList, int k) {
        newList = new ArrayList();
        if (arrayList.size() == 0) {
            return newList;
        }
        System.out.println("K: " + k);
        System.out.println("size: " + arrayList.size());
        int start = k - 1;
        removeElement(arrayList, start, k);
        return newList;
    }

    private static void removeElement(ArrayList arrayList, int lastPosition, int k) {
        System.out.println("LAST: " + lastPosition);
        if (arrayList.size() == 1) {
            newList.add(arrayList.get(0));
            arrayList.remove(0);
        } else {
            while (lastPosition >= arrayList.size()) {
                lastPosition -= arrayList.size();
            }
            //if (lastPosition >= arrayList.size()) lastPosition -= arrayList.size();
            while (arrayList.size() > 0) {
                printOriginList(arrayList);

                newList.add(arrayList.get(lastPosition));
                printNewList();

                arrayList.remove(lastPosition);

                if (lastPosition + k - 1 <= arrayList.size()) {
                    lastPosition = lastPosition + k - 1;
                    removeElement(arrayList, lastPosition, k);
                } else {
                    lastPosition = lastPosition + k - 1 - arrayList.size();
                    removeElement(arrayList, lastPosition, k);
                }

            }
        }
    }

    private static void printOriginList(ArrayList arrayList) {
        System.out.print("ORIGIN ");
        for (Object o : arrayList) {
            System.out.print(o.toString() + "; ");
        }
        
        System.out.println();
    }

    private static void printNewList() {
        System.out.print("NEW ");
        for (Object o : newList) {
            System.out.print(o.toString() + "; ");
        }
        System.out.println();
    }
}
