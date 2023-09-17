 public class Test2 {
    int roll;
    String namne;
    String lastname;
    float salary;
    void Student(int roll){
        System.out.println("My roll number" );
    }
    int Student1(String name){
        System.out.println("vaidya");
        return 4;
    }
    String Student2(String lastname) {
        System.out.println("pandey");
        return "hi";
    }
    float Student3(float salary){
        System.out.println(salary);
        return 0.5f;
    }
    public static void main(String [] args){
        Test2 av=new Test2();
        av.Student(45);
        av.Student1("prasad");
        av.Student2("vaidya");
        av.Student3(25.254155f);
    }
}
