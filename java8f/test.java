package java8f;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class test {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("greek","gree","show","meen","jr");
        Predicate<String>p=(s)-> s.startsWith("g");
        for (String a:list)
              {
                  if(p.test(a))
                      System.out.println(a);
        }
    }
}
