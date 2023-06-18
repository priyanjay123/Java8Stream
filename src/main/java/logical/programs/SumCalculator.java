package logical.programs;

import java.util.Arrays;
import java.util.List;

public class SumCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        Integer reduceSum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(reduceSum);

    }
}
