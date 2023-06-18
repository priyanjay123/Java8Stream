package stream.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango","Apple");

        List<String> collectedList = fruits.stream().collect(Collectors.toList());
        System.out.println(collectedList);

        Set<String> collectedSet = fruits.stream().collect(Collectors.toSet());
        System.out.println(collectedSet);

        String collectedString = fruits.stream().collect(Collectors.joining(","));
        System.out.println(collectedString);
    }
}
