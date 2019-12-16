import java.util.Arrays;
import java.util.stream.Stream;

public class StringSeparator {

    public static Stream<Integer> separate(String s) {
        return Arrays.stream(s.split("[,\\n]")).map(Integer::parseInt);
    }
}
