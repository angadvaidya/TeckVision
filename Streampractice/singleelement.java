package Streampractice;

import java.util.stream.Stream;

public class singleelement {
    /*public static void main(String[] args) {
        Stream<Student>singleElementStream= Stream.of(new Student());
        System.out.println(singleElementStream.count());*/
    public static void main(String[] args) {
        Stream<Student>singleelement=Stream.of(new Student());
        System.out.println(singleelement.count());
        Stream<Integer>show=Stream.of(1,2,3,4,54,5,6);
        System.out.println(show.count());
    }
    }

