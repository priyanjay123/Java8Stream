package logical.programs;

import java.util.Random;

public class RandomNumberPrinter {
    public static void main(String[] args) {

        Random random = new Random();

        random.ints(10, 0 , 10).forEach(System.out ::println);
    }
}
