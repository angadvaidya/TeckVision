package Streampractice;

import java.util.stream.Stream;

public class Student {
    public static void main(String[] args) {
        Stream<Student>emptyStream=Stream.empty();
        System.out.println(emptyStream.count());
    }
}

