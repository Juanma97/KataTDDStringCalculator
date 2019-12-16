import java.util.Optional;

public class StringCalculator {
    public int add(String s) {
        if(s.length() == 0) return 0;
        Optional<Integer> result = StringSeparator.separate(s).reduce(Integer::sum);
        return result.orElse(0);
    }
}
