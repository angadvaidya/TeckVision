package Streampractice;

import java.util.stream.Stream;

public class sevennumber {
    public static void main(String[] args) {
        Stream<Integer>streamOfNumbers=Stream.of(7,2,6,9,4,3,1);
        System.out.println(streamOfNumbers.count());
    }
}
