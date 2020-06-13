import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSample {

    public static void main(String[] args) {
        String[] nums = {"one", "two", "three", "four"};
        List<String> myArrayList = new ArrayList(Arrays.asList(nums));
        myArrayList.removeIf(s -> (s.equals("for")));
        for (String s : myArrayList) {
            System.out.println(s);
        }

        Printable[] items = {new Document("A document"),
                new Snippet("A snippet."),
                new Document("Another document."),
                new Snippet("Another snippet."),
                new Document("")
        };

        var doc = new Document("pippo");
        doc.print();

        List<Printable> pList = Arrays.asList(items);

        ArrayList<Printable> myList = new ArrayList<>(pList);

        for (var item : myList) {
            item.print();
        }

        lambdaTest();

    }

    static void lambdaTest(){
        System.out.println("************************************");
        String[] names = {"Ned", "Fred", "Jessie", "Alice", "Rick"};
        var myList = new ArrayList<String>(Arrays.asList(names));

        myList.replaceAll(s -> s.toUpperCase());
        System.out.println("Lambda version: " + myList);
        myList.forEach(ArrayListSample::printWithTabs);

    }

    public static void printWithTabs(String s){
        System.out.printf("%s\t", s);
    }

}
