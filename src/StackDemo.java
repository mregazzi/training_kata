import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();

        books.push("Ulysses");
        books.push("War and Peace");
        System.out.println("Peek: " + books.peek());
        System.out.println("After peek: " + books);

        System.out.println("Pop:" + books.pop());
        System.out.println("After pop:" + books);

        books.pop();
        System.out.println("Empty after another pop:" + books.empty());

        String[] bookNames = {"Pride and Prejudice", "A Tale of Two Cities",
                "The Iliad", "The Republic", "Alice Adventures in Wonderland"};

        for (var name : bookNames) {
            books.push(name);
        }
        System.out.println("After loop to push array statements onto Stack");
        System.out.println(books);
        System.out.println("Peek: " + books.peek());
        System.out.println("Size: " + books.size());
        System.out.println("First element: " + books.firstElement());
        System.out.println("Last element: " + books.lastElement());

    }

}
