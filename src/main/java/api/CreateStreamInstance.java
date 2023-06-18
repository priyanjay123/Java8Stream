package api;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamInstance {
    public static void main(String[] args) {
        // From a Collection
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Stream<String> stream = names.stream();

        //From an Array
        String[] cities = {"London","Bengaluru","Paris","New Delhi"};
        Stream<String> stream1 = Arrays.stream(cities);

        //Factory method of()
        Stream<String> apple = Stream.of("Apple", "Banana", "Mango");
        
        //from a builder()
        Stream.Builder<String> builder = Stream.builder();
        builder.add("Red");
        builder.add("Green");

        //Empty stream 
        Stream<Integer> empty = Stream.empty();

        //From i/o channels
        try(BufferedReader reader = new BufferedReader(new FileReader("E:\\DS\\Java8FeaturesUdemy\\src\\main\\java\\api\\data.txt"))){
            Stream<String> lines = reader.lines();

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
