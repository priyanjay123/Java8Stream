package stream.operations;

import java.util.Arrays;
import java.util.List;

public class StreamForEachExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream().forEach(num -> System.out.println(num * 2));
    }
}
