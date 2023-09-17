package compartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Employename {
    public Employename() {
    }

    @Override
    public String toString() {
        return "Employename{}";
    }

    public static void main(String[] args) {
        Emp emp = new Emp(1, "sham", "vaidya", 48);
        Emp emp1 = new Emp(2, "vijay", "hedge", 30);
        Emp emp2 = new Emp(1, "sham", "hedge", 25);


        List<Emp> list = new ArrayList<>();
        list.add(emp);
        list.add(emp1);
        list.add(emp2);
        Comparator<Emp> com = new Comparator<Emp>() {

            @Override
            public int compare(Emp o1, Emp o2) {
                return 0;
            }

            @Override
            public Comparator<Emp> reversed() {
                return Comparator.super.reversed();
            }

            @Override
            public Comparator<Emp> thenComparing(Comparator<? super Emp> other) {
                return Comparator.super.thenComparing(other);
            }

            @Override
            public <U> Comparator<Emp> thenComparing(Function<? super Emp, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
                return Comparator.super.thenComparing(keyExtractor, keyComparator);
            }

            @Override
            public <U extends Comparable<? super U>> Comparator<Emp> thenComparing(Function<? super Emp, ? extends U> keyExtractor) {
                return Comparator.super.thenComparing(keyExtractor);
            }

            @Override
            public Comparator<Emp> thenComparingInt(ToIntFunction<? super Emp> keyExtractor) {
                return Comparator.super.thenComparingInt(keyExtractor);
            }

            @Override
            public Comparator<Emp> thenComparingLong(ToLongFunction<? super Emp> keyExtractor) {
                return Comparator.super.thenComparingLong(keyExtractor);
            }

            @Override
            public Comparator<Emp> thenComparingDouble(ToDoubleFunction<? super Emp> keyExtractor) {
                return Comparator.super.thenComparingDouble(keyExtractor);
            }


        };
        System.out.println(list);
        nameComparator comparator=new nameComparator();
        Comparator<? super Emp> age = null;
        Collections.sort(list,age);
    }
        }


