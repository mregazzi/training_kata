import org.junit.jupiter.api.Test;

import java.util.*;

public class TestCollections {

    @Test
    public void testCollectionsAndGenerics(){
        List<String> strings = new ArrayList<>();
        strings.add("Pippo");
        strings.add("Pluto");
        strings.add("Paperino");
        for (String s : strings) {
            System.out.println(s.toUpperCase());
        }

        Map<Integer, List<String>> mappa = new HashMap<>();
        SortedMap<Integer, String> mappaOrdinata = new TreeMap<>();
        mappa.put(0, strings);
        mappa.put(1, strings);
        mappa.put(2, strings);

        for (int i = 0; i < mappa.size(); i++) {
            System.out.println(mappa.get(i));
        }

        System.out.println("******************");
        mappaOrdinata.put(2, "Paperino");
        mappaOrdinata.put(1, "Pluto");
        mappaOrdinata.put(0, "Pippo");

    }
}
