package terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCountingExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "is", "Awesome","Language");
        Long count = words.stream().collect(Collectors.counting());
        System.out.println(count);
    }
}
