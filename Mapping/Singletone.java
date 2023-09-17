package Mapping;


/*
public class Singletone {
    private static Singletone singletone;
    private Singletone(){}
    public static Singletone getInstance(){
        if(singletone ==null)
            singletone= new Singletone();
        return singletone;
    }

    }
    class ClientTest{
        public static void main(String[] args) {
            Singletone singletone=Singletone.getInstance();
            Singletone singletone1=singletone.getInstance();

            System.out.println(singletone.hashCode());
            System.out.println(singletone1.hashCode());
        }
    }
*/


/*
import java.io.*;

public class Singletone implements Serializable {
    private static Singletone singletoneUID=77878454545l;
    private Singletone(){}
    public static Singletone getInstance(){

}
class ClientTest{
    public static <singletoneUID> void main(String[] args)throws IOException {
        ObjectOutput objectOutput=null;

        Singletone singletone1=Singletone.getInstance();
        try{
            objectOutput=new ObjectOutputStream(new FileOutputStream("singletone.ser"));
            objectOutput.writeObject(singletone1);
            objectOutput.flush();

        }catch (Exception e){
            e.getStackTrace();
        }finally {
            if (objectOutput != null)
                objectOutput.close();
        }
        ObjectIndput objectInput=null;
        try{objectInput=new ObjectInputStream(new FileInputStream("singleton.ser"));



}
       */
/* Singletone singletone=Singletone.getInstance();
        Singletone singletone1=singletone.getInstance();

        System.out.println(singletone.hashCode());
        System.out.println(singletone1.hashCode());*//*

        Object object=null;
    }
}


*/


/*
import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

    private List<String> empList;

    public Employees(){
        empList = new ArrayList<String>();
    }

    public Employees(List<String> list){
        this.empList=list;
    }
    public void loadData(){
        //read all employees from database and put into the list
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmpList()){
            temp.add(s);
        }
        return new Employees(temp);
    }

}
*/
/*
package com.journaldev.design.test;

import java.util.List;

import com.journaldev.design.prototype.Employees;

public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        //Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("John");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Pankaj");

        System.out.println("emps List: "+emps.getEmpList());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);
    }

}

*/
