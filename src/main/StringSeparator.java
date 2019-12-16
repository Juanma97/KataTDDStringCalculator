import java.util.Arrays;
import java.util.stream.Stream;

public class StringSeparator {

    public static Stream<Integer> separate(String s, String separator) {
        return Arrays.stream(s.split(separator)).map(Integer::parseInt);
    }
}
