import java.util.Arrays;
import java.util.Optional;

public class StringCalculator {
    public int add(String s) {
        if(s.length() == 0) return 0;
        Optional<Integer> result = Arrays.stream(s.split("[,\\n]")).map(Integer::parseInt).reduce(Integer::sum);
        return result.orElse(0);
    }
}
