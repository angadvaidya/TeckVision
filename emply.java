public class emply
{
    private String name;
    private String middle_name;
    private String Lastname;
    private  String Address;
    private int emplay_id;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getEmplay_id() {
        return emplay_id;
    }

    public void setEmplay_id(int emplay_id) {
        this.emplay_id = emplay_id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        emply n=new emply();
        n.setName("saurab");
        n.setMiddle_name("shankarao");
        n.setLastname("patil");
        n.setAddress("latur");
        n.setEmplay_id(4556);
        n.setSalary(800000);


        System.out.println(" first name " +n.getName());
        System.out.println(" middle name  "+n.getMiddle_name());
        System.out.println("Last name   "+n.getLastname());
        System.out.println("address "+n.getAddress());
        System.out.println("employ is   "+n.getEmplay_id());
        System.out.println("salary  "+n.getSalary());

    }
}
