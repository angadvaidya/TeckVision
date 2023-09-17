package Streampractice;

import java.util.Optional;
import java.util.stream.Stream;

public class findesecond {
    public static void main(String[] args) {
        Optional<String>secondElement= Stream.of("first","second","third").findAny();
        System.out.println(secondElement);

    }
}
