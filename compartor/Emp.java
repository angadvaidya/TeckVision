package compartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class  nameComparator implements Comparator<Emp> {


    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class id_num implements Comparator<Emp> {

    @Override
    public int compare(Emp o1, Emp o2) {
        return o1.getId()- o1.getId();
    }
}



class Emp implements Comparable{
    private int id;
    private String name;
    private String lastname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Emp(int id, String name, String lastname, int age) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }

    Emp(){

    }


    public static void main(String[] args) {
        Emp emp=new Emp(1,"satish","bhanushali",29);
        Emp emp1=new Emp(2,"vijay","kadpavad",26);
        Emp emp2=new Emp(3,"om","kolhe",22);
        Emp emp3=new Emp(4,"asha","wagh",25);

        List<Emp>list=new ArrayList<>();
        list.add(emp);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

       Comparator<Emp> com = new Comparator<Emp>() {
           @Override
           public int compare(Emp o1, Emp o2) {
               if(o1.id > o2.id){
                   return 1;
               }
               else {
                   return -1;
               }
           }
       };

       Collections.sort(list,com);
        System.out.println(list);

//        Collections.sort(list);
//        System.out.println(list);
//        nameComparator comparator=new nameComparator();
//        Collections.sort(list,comparator);
//        System.out.println(list);
//        id_num ref1=new id_num();
//Collections.sort(list,ref1);
//        System.out.println(list);


    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

}
