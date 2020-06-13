package fizzbuzz;

import fizzbuzz.Rule;

public class DefaultRule implements Rule {
    public void applyRule(int number, StringBuilder result) {
        if (result.toString().isEmpty()) {
            result.append(number);
        }
    }
}
