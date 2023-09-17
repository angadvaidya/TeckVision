package Streampractice;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class collect {
   public static void main(String[] args) {
        List<String> name=new ArrayList<String>();
        name.add("mangesh");
        name.add("namdev");
        name.add("satish");
        name.add("pradeep");
        name.add("tanu");
        name.add("mangesh");
        name.add("shaileash");
          //collect method is used to collection of give the number
        List<String>firstName=name.stream().limit(4).collect(Collectors.toList());
        System.out.println(firstName);
        List<String>lastName=name.stream().limit(2).collect(Collectors.toList());
        System.out.println(lastName);
        name.forEach(n-> System.out.println(n));
      //  List<String>firstName=name.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }

}

/*import java.util.ArrayList;
class test {
   public static void main(String args[]) {
        ArrayList N = new ArrayList();
        N.add(1);
         N.add(2);
        N.add(3);
        N.add(4);
        N.forEach(n -> System.out.println(n));
   }
}*/

