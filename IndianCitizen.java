public class IndianCitizen {
    String firstname;
    String middalename;
    String lastname;
    int age;



    void eat(String firstname, String middalename, String lastname, int age) {
        System.out.println(firstname + " " + middalename + " " + lastname + " " + age);
    }

    public static void main(String[] args) {
        IndianCitizen av = new IndianCitizen();
        av.eat("angad", "limnbajirao", "vaidya", 22);
    }
}





