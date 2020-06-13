package fizzbuzz;

public class WordRule implements Rule {
    private final int divisor;
    private final String word;

    public WordRule(int divisor, String word) {
        this.divisor = divisor;
        this.word = word;
    }

    public void applyRule(int number, StringBuilder result) {
        if (number % divisor == 0) {
            result.append(word);
        }
    }
}
