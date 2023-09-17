package encapsulation;

public class dypatil {
    int id;
    String StudentName;
    String address;

    public dypatil() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "dypatil{" +
                "id=" + id +
                ", StudentName='" + StudentName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

   public void show(int id, String studentName, String address) {

   }

    public static void main(String[] args){

           dypatil n = new dypatil();
           n.setId(1);
           n.setStudentName("amol");
           n.setAddress("asarjan,nanded");
           System.out.println("Student name" + n.getId());
        System.out.println(n.getStudentName());


    }
}
