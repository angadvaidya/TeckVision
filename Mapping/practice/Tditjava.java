package Mapping.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tditjava {
    int id;
    String name;
    String last;
    String Address;
    String Number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    @Override
    public String toString() {
        return "Tditjava{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last='" + last + '\'' +
                ", Address='" + Address + '\'' +
                ", Number='" + Number + '\'' +
                '}';
    }


    public Tditjava(int id, String name, String last, String address, String number) {
        this.id = id;
        this.name = name;
        this.last = last;
        Address = address;
        Number = number;
    }

    public static void main(String[] args) {
       /* Tditjava java=new Tditjava(10,"saurab","patil","lature","23");
        Tditjava java1=new Tditjava(20,"viajay","kadpewad","Nanded","24");
        Tditjava java2=new Tditjava(30,"akash","biradar","lature","35");

*/


        List<Tditjava> list=new ArrayList<>();

        list.add(new Tditjava(10,"saurab","patil","lature","23"));
        list.add(new Tditjava(20,"viajay","kadpewad","Nanded","24"));
        list.add(new Tditjava(30,"akash","biradar","lature","35"));

      Map<Integer,String> B=new HashMap<>();
      for(Tditjava kk: list){
          B.put(kk.getId(), kk.getName());
          {
              System.out.println(B);

          }
        }


/*        list.add(java);
        list.add(java1);
        list.add(java2);

        */



//
//        Map<Integer,String> N=list.stream().collect(Collectors.toMap(Tditjava::getId,Tditjava::getName));
//        System.out.println(N);
//        Map<Integer,String>M=list.stream().collect(Collectors.toMap(m->m.getId(),m->m.getName()));
//        System.out.println(M);




    }
}
