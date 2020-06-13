package fizzbuzz;

import java.util.List;

public class FizzBuzzGame {

    List<Rule> rules;

    public FizzBuzzGame(List<Rule> rules) {
        this.rules = rules;
    }

    public String say(int number) {
        StringBuilder result = new StringBuilder();

        for (Rule rule : rules) {
            rule.applyRule(number, result);
        }

        return result.toString();
    }

}
