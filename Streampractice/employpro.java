package Streampractice;

import java.util.ArrayList;
import java.util.List;

public class employpro {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    public employpro(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employpro{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age + ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }
    public static  void main(String[] args) {
        List<employpro>employlist=new ArrayList<employpro>();
        employlist.add(new employpro (1,"vijay",25,"male","mech",1990,45000));
        employlist.add(new employpro (2,"ajay",26,"male","civil",1993,40000));
        employlist.add(new employpro (3,"asha",24,"female","computer",2020,85000));
        employlist.add(new employpro (4,"shradha",27,"female","IT",1994,115000));
        employlist.add(new employpro (5,"shubham",28,"male","mech",2000,55000));
        employlist.add(new employpro (6,"saurab",25,"male","civil",2020,65000));
        employlist.add(new employpro (7,"satish",28,"male","mech",2022,45000));
        employlist.add(new employpro (8,"archena",25,"female","civil",2023,85000));
        employlist.add(new employpro (9,"akash",26,"male","mech",2021,75000));
        employlist.add(new employpro (10,"jaya",24,"female","mech",2020,45000));
        employlist.add(new employpro (11,"akash",26,"male","mech",2021,75000));
        employlist.add(new employpro (12,"nichay",28,"male","mech",2023,65000));
        employlist.add(new employpro (13,"akashay",25,"male","mech",2012,45000));
/*

        Map<String,Long> noOfMaleAndFemaleEmployees = employlist.stream().collect(Collectors.groupingBy(employpro::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployees);

*/
/*        employlist.stream()
                .map(employpro::getDepartment)
                .distinct()
                .forEach(System.out::println);*/
        /*Map<String,Double> avgAgeOfMaleAndFemaleEmployees=
                employlist.stream().collect(Collectors.groupingBy(employpro::getGender,Collectors.averagingDouble(employpro::getAge)));
        System.out.println(avgAgeOfMaleAndFemaleEmployees);*//*
        Optional<employpro>highestpaidemployeeWrapper=employlist.stream().collect(Collectors.maxBy(Comparator.comparingDouble(employpro::getSalary)));
        employpro highestpaidemployee= highestpaidemployeeWrapper.get();
        System.out.println("Details of highest paid empl   "+highestpaidemployee.getAge());
        System.out.println("Details of highest paid empl    "+highestpaidemployee.getSalary());
        System.out.println("Details of highest paid empl     "+highestpaidemployee.getDepartment());*/
/*
        employlist.stream()
                .filter(employpro -> employpro.getYearOfJoining()>2020)
                .map(employpro ::getName)
                .forEach(System.out::println);
*/

/*
        Map<String,Long>employproCountByDepartment=
                employlist.stream().collect(Collectors.groupingBy(employpro::getDepartment,Collectors.counting()))
                Set< Entry <String,Long>>entryset=employproCountByDepartment.entrySet();
        for(Entry<String,Long>entry:entryset){
            System.out.println(entry.getkey()+":"+entry.getalue);
        }
*/

/*
        Map <Integer,String> obj =employlist.stream().collect(Collectors.toMap(employpro::getId,employpro::getName));
        System.out.println(obj);
*/
/*
        List obj=employlist.stream().collect(Collectors.toCollection(HashMap::new));
        System.out.println(obj);

*/


    }




}
