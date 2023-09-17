package encapsulation;

public class Satish {
    private int age;
    private String lastname;
    Satish(){}
    Satish(int age,String lastname ){
        this.age=age;
        this.lastname=lastname;
    }
    public int getAge(){
        return age;
    }
    public String getLastname(){
        return lastname;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
}
class show{
    public static void main(String[] args) {
        Satish s=new Satish();
        s.setAge(14);
        s.setLastname("Bhanushali");
        System.out.println(s.getAge());
        System.out.println(s.getLastname());

    }
}
