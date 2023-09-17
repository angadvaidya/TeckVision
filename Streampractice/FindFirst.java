package Streampractice;

import java.util.Optional;
import java.util.stream.Stream;

public class FindFirst {
    public static void main(String[] args) {
        Optional<String>secondElement= Stream.of("tharty","first","second","thirds","fourth").findAny();
        System.out.println(secondElement);
    }
}
