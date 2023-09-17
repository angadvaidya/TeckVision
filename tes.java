public class tes {
    String name;
    String lastname;
    int salary;
    long mobilenumber;

    void Av(String name, String lastname, int salary, long mobilenumber) {
        System.out.println(name + "   " + lastname + "   " + salary + "     " + mobilenumber);
    }

    int Av1(int salary, long mobilenumber) {
        System.out.println(salary + " " + mobilenumber);
        return 5456255;
    }

    void Av2(String name, String lastname, int salary, long mobilenumber) {
        System.out.println(name + " " + lastname + " " + salary + " " + mobilenumber);
    }

    public static void main(String[] args) {
        tes java = new tes();
        java.Av("angad", "vaidya", 45485555, 8408000680l);
        java.Av1(458656566, 8408000680l);
        java.Av2("mangesh", "mangnale", 88895645, 8408000680l);


        tes java1 = new tes();
        java1.Av("pradip", "vaidya", 45485555, 8408000680l);
        java1.Av1(458656566, 8408000680l);
        java1.Av2("om", "mangnale", 88895645, 8408000680l);

        tes java2 = new tes();
        java2.Av("deelip", "vaidya", 600000, 9834359521l);
        java2.Av1(78745454, 848465514545l);
        java2.Av2("asha", "wagh", 45623211, 8888224913l);
    }
}




