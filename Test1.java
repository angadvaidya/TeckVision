public class Test1 {
    int id;
    String name;
    String lastname;
    String company_name;
    float salary;
    int account_number;

    void emp(int id, String name, String lastname, String company_name, float salary, int account_number) {
        System.out.println(+id + " " + name + " " + lastname + " " + company_name + " " + salary + " " + account_number);
    }

    int emp1(int id, String name, String lastname, String company_name, float salary, int account_number) {
        System.out.println(+id + " " + name + " " + lastname + " " + company_name + " " + salary + " " + account_number);
        return 455;
    }

    void emp2(int id, String name, String lastname, String company_name, float salary, int account_number) {
        System.out.println(+id + " " + name + " " + lastname + " " + company_name + " " + salary + " " + account_number);
    }

    public static void main(String args[]) {
        Test1 obj = new Test1();
        obj.emp(5, "mangesh", "mangnale", "cumming", 45.455255f, 456665866);
        obj.emp1(6, "sourab", "patil", "cumming", 45.56555f, 789564455);
        obj.emp2(7, "vaiday", "patil", "cumming", 21.25455f, 787844564);
    }
}