import java.util.Arrays;

public class YouOnlyNeedOne {
    public static boolean check(Object[] objects, Object o) {
        System.out.println(Arrays.stream(objects).filter(o));
                return true;
    }
}
