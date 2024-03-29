import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    private static StringCalculator stringCalculator;

    @BeforeClass
    public static void setup() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void given_empty_string_should_return_zero() {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void given_one_number_should_return_the_same_number() {
        assertEquals(1, stringCalculator.add("1"));
        assertEquals(2, stringCalculator.add("2"));
        assertEquals(3, stringCalculator.add("3"));
    }

    @Test
    public void given_two_numbers_should_return_the_sum_of_numbers() {
        assertEquals(2, stringCalculator.add("1,1"));
        assertEquals(3, stringCalculator.add("1,2"));
        assertEquals(7, stringCalculator.add("2,5"));
    }

    @Test
    public void given_multiple_numbers_should_return_their_sum() {
        assertEquals(7, stringCalculator.add("1,1,1,1,1,1,1"));
        assertEquals(10, stringCalculator.add("2,3,5"));
    }

    @Test
    public void given_two_numbers_with_return_separator_should_return_their_sum() {
        assertEquals(2, stringCalculator.add("1\n1"));
        assertEquals(3, stringCalculator.add("1\n2"));
        assertEquals(12, stringCalculator.add("5\n7"));
    }

    @Test
    public void given_multiple_numbers_with_return_and_comma_separators_should_return_their_sum() {
        assertEquals(3, stringCalculator.add("1,1\n1"));
        assertEquals(5, stringCalculator.add("1,3\n1"));
    }

    @Test
    public void given_one_number_ending_with_return_separator_only_return_the_number() {
        assertEquals(1, stringCalculator.add("1\n"));
    }

    @Test
    public void given_different_separator_should_return_their_sum() {
        assertEquals(2, stringCalculator.add("//;\n1;1"));
    }
}
