package Streampractice;

import java.util.stream.Stream;

public class Foreach {
    public static void main(String[] args) {
        Stream.of("first","second","third","fourth").limit(2).distinct().forEach(System.out::println);
    }
}
