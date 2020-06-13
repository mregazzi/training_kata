package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class FizzBuzzGameTest {

    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";
    public static final String BANG = "Bang";

    @Test
    public void shouldReturn1WhenSay1() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(new ArrayList<>(Arrays.asList(
                new DefaultRule())));

        assertEquals("1", fizzBuzzGame.say(1));
    }

    @Test
    public void shouldReturn2WhenSay2() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(new ArrayList<>(Arrays.asList(
                new DefaultRule())));

        assertEquals("2", fizzBuzzGame.say(2));
    }

    @Test
    public void shouldReturnFizzWhenSayMultipleOf3() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(new ArrayList<>(Arrays.asList(
                new WordRule(3, FIZZ))));

        assertEquals(FIZZ, fizzBuzzGame.say(3));
        assertEquals(FIZZ, fizzBuzzGame.say(6));
    }

    @Test
    public void shouldReturnBuzzWhenSayMultipleOf5() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(new ArrayList<>(Arrays.asList(
                new WordRule(5, BUZZ))));

        assertEquals(BUZZ, fizzBuzzGame.say(5));
        assertEquals(BUZZ, fizzBuzzGame.say(10));
    }

    @Test
    public void shouldReturnFizzBuzzWhenSayMultipleOf3And5() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(new ArrayList<>(Arrays.asList(
                new WordRule(3, FIZZ),
                new WordRule(5, BUZZ))));

        assertEquals(FIZZ + BUZZ, fizzBuzzGame.say(3 * 5));
    }

    @Test
    public void shouldReturnBangWhenSayMultipleOf7() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(new ArrayList<>(Arrays.asList(
                new WordRule(7, BANG))));

        assertEquals(BANG, fizzBuzzGame.say(7));
        assertEquals(BANG, fizzBuzzGame.say(7 * 2));
    }

    @Test
    public void shouldReturnFizzBangWhenSayMultipleOf3And7() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(new ArrayList<>(Arrays.asList(
                new WordRule(3, FIZZ),
                new WordRule(7, BANG))));

        assertEquals(FIZZ + BANG, fizzBuzzGame.say(3 * 7));
    }

    @Test
    public void shouldReturnFizzBangWhenSayMultipleOf5And7() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(new ArrayList<>(Arrays.asList(
                new WordRule(5, BUZZ),
                new WordRule(7, BANG))));

        assertEquals(BUZZ + BANG, fizzBuzzGame.say(5 * 7));
    }

    @Test
    public void shouldReturnFizzBangWhenSayMultipleOf3And5And7() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(new ArrayList<>(Arrays.asList(
                new WordRule(3, FIZZ),
                new WordRule(5, BUZZ),
                new WordRule(7, BANG))));

        assertEquals(FIZZ + BUZZ + BANG, fizzBuzzGame.say(3 * 5 * 7));
    }

}
