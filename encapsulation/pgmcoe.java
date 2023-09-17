package encapsulation;

public class pgmcoe {
    int id;
    String name;
    String last;
    double Mo_No;
    String college_address;
    String permanant_address;

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

    public double getMo_No() {
        return Mo_No;
    }

    public void setMo_No(double mo_No) {
        Mo_No = mo_No;
    }

    public String getCollege_address() {
        return college_address;
    }

    public void setCollege_address(String college_address) {
        this.college_address = college_address;
    }

    public String getPermanant_address() {
        return permanant_address;
    }

    public void setPermanant_address(String permanant_address) {
        this.permanant_address = permanant_address;
    }

    @Override
    public String toString() {
        return "pgmcoe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last='" + last + '\'' +
                ", Mo_No=" + Mo_No +
                ", college_address='" + college_address + '\'' +
                ", permanant_address='" + permanant_address + '\'' +
                '}';
    }

    public pgmcoe(int id, String name, String last, double Mo_no, String college_address, String permanant_address){

    }

    public static void main(String[] args) {
        pgmcoe n=new pgmcoe(1,"stish","bhanushali",8756945656d,"Wagholi","Nanded");
        n.setId(1);
        n.setName("stish");
        System.out.println("Student id \n "+n.getId()+n.getLast());
        System.out.println("Student name  "+n.getName());
    }
}



