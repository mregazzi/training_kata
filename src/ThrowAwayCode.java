import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ThrowAwayCode {

    public static void main(String[] args) {
        System.out.println("Supplier usage example:");
        Supplier <String> supplier = () -> "Hello!";
        String s = supplier.get();
        System.out.println(s);

        System.out.println("Consumer usage example:");
        Consumer<String> consumer = (String string) -> System.out.println(string);
        consumer.accept("Ciao consumer");

        System.out.println("Predicate usage example for filtering:");
        List<String> strings = new ArrayList<>(List.of("one", "two", "three", "four", "five"));
        strings.removeIf(string1 -> !string1.startsWith("t"));
        strings.forEach(string -> System.out.println(string));

        System.out.println("Predicate usage example for filtering:");
        User sarah = new User("Sarah");
        User james = new User("James");
        User mary = new User("Mary");
        User john = new User("John");

        List<User> users = List.of(sarah, james, mary, john);
        List<String> names = new ArrayList<>();
        Function<User,String> toName = (User user) -> user.getName();
        for (User user : users) {
            names.add(toName.apply(user));
        }

        users.forEach(u -> System.out.println(u));
        names.forEach(n -> System.out.println(n));

        Consumer<String> c1 = s1 -> System.out.println("c1 consumes " + s1);
        Consumer<String> c2 = s2 -> System.out.println("c2 consumes " + s2);

        Consumer<String> c3 = c1.andThen(c2);

        c3.accept("Hello");

        Predicate<String> isNull = sp -> sp == null;
        System.out.println("For null = " + isNull.test(null));
        System.out.println("Fer Hello = " + isNull.test("Hello"));

        Predicate<String> isEmpty = sp2 -> sp2.isEmpty();
        System.out.println("For empty = " + isEmpty.test(""));
        System.out.println("Fer Hello = " + isEmpty.test("Hello"));

        Predicate<String> p = isNull.negate().and(isEmpty.negate());
        System.out.println("For null = " + p.test(null));
        System.out.println("For empty = " + p.test(""));
        System.out.println("For Hello = " + p.test("Hello"));

    }

    private static class User {
        private String name;

        private User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString(){
            return "User [name=" + this.name + "]";
        }
    }
}
