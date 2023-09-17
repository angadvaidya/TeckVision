public class om {
    private String name;
    private String middle_name;
    private String Lastname;
    private String Address;
    private  String village;
    private String dist;
    private String state;
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

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = Double.parseDouble(salary);
    }

    public static void main(String[] args) {
        om n=new om();
        n.setName("om");
        n.setMiddle_name("yeshavant");
        n.setLastname("wagh");
        n.setVillage("naleshwor");
        n.setAddress("naleshor at post nanded");
        n.setDist("nanded");
        n.setState("maharastra");
        n.setSalary(89445454554d);




        n .getName();
        n.getMiddle_name();
        n.getLastname();
        n.getAddress();
        n.getDist();
        n.getVillage();
        n.getState();
        n.getSalary();



    }
}
