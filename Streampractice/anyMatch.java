package Streampractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class anyMatch {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("mangesh");
        name.add("namdev");
        name.add("satish");
        name.add("pradeep");
        name.add("tanu");
        name.add("mangesh");
        name.add("shaileash");

        long M=name.stream().filter((String names)-> names.length()>6).count();
        System.out.println(M);
        double s=name.stream().filter((String names)->names.length()<5).count();
        System.out.println(s);



     //  Stream<Integer>st= Stream.of(1, 2, 3, 7, 8, 54, 2, 65, 45, 45, 55, 55);
//        System.out.println(st.count());
/*        Stream<String>sp=Stream.of("mangesh","dinesh","pankage","akash");
        sp.sorted().forEach(System.out::println);
        Set<String> collectss = sp.sorted().collect(Collectors.toSet());
        System.out.println(collectss);*/
        int sum =Arrays.stream(new int[]{1,2,3,4,5,6,98,7,5,5,5,9}).reduce(10,(a,b )->a*b);
        System.out.println(sum);
        OptionalInt mul=Arrays.stream(new int[]{1,8,5,5,7,8,8}).reduce((a,b)->a*b);
        System.out.println(mul);


/*

        if(name.stream().anyMatch((String names)->names.length()==6)) {
            System.out.println("yes we are going");
        }
            else{
                System.out.println("condition is not satisfy");
            }
            name.stream().filter((String names)->names.length()>5).sorted().forEach(System.out::println);
*/
//            name.stream().sorted((String name1,String name2)->name1.length()-name2.length()).forEach(System.out::println);
//            name.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
/*
            name.stream().map(String::hashCode).
                forEach(System.out::println);
            name.stream().skip(3).forEach(System.out::println);
*/




        }

    }

