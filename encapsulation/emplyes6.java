package encapsulation;

public class emplyes6 {
    int id;
    String name;
    String companiname;
    String address;
    double salary;

    public emplyes6(int id, String name, String companiname, String address, double salary) {
      /*  this.id = id;
        this.name = name;
        this.companiname = companiname;
        this.address = address;
        this.salary = salary;*/
    }

    public emplyes6() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompaniname(String companiname) {
        this.companiname = companiname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCompaniname() {
        return companiname;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

/*
    @Override
    public String toString() {
        return "emplyes6{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", companiname='" + companiname + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
*/

    int show(int id, String name, String companiname, String address, double salary) {
        System.out.println("emplay details     \n"+id+ "\n"+name+" \n"+companiname+" \n"+address+" \n"+840000);
        return 5;


    }

    public static void main(String[] args) {
        emplyes6 w=new emplyes6();
        w.show(25,"amol","hub india","nanded",7800000);
    }
}
