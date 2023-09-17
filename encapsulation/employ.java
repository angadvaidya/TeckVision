package encapsulation;

public class employ {
    String fistname;
    int Id;
    String address;
employ(){

}
    public employ(String fistname, int id, String address) {
        this.fistname = fistname;
        this.Id = id;
        this.address = address;
    }

    public String getFistname() {
        return fistname;
    }

    public void setFistname(String fistname) {

    this.fistname = fistname;
    }

    public int getId(int i) {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "employ{" +
                "fistname='" + fistname + '\'' +
                ", Id=" + Id +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        employ one = new employ("sdfgf",4545,"aoiuy");
       // one.setFistname("amol");
        //one.setId(1);
        //one.setAddress("nanded");
        System.out.println("hiii "+one.getFistname());
       /* one.getFistname();
        one.getId();
        one.getAddress();*/
    }



}


