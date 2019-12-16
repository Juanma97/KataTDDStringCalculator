import java.util.Optional;

public class StringCalculator {
    public int add(String numbers) {
        if(numbers.length() == 0) return 0;
        Optional <Integer> result;
        if(numbers.contains("//")) {
            String separator = numbers.substring(2, numbers.indexOf("\n"));
            numbers = numbers.substring(numbers.indexOf("\n") + 1);
            result = StringSeparator.separate(numbers, separator).reduce(Integer::sum);
        }else {
            result = StringSeparator.separate(numbers, "[,\\n]").reduce(Integer::sum);
        }
        return result.orElse(0);
    }
}
