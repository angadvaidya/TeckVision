package collectore;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectoreexample {
    public static void main(String[] args) {
        List<Integer>N= Arrays.asList(4,6,5,6,25,8,7,2,1,54);
        List<Integer>oddNumber=N.stream().filter(i -> i%2 !=0).collect(Collectors.toList());
        System.out.println(oddNumber);
        List<Integer>evenNumber=N.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenNumber);
    }
}
