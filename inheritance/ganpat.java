package inheritance;

public class ganpat {
    public void property() {
        System.out.println("i hava big and 32 hecter form");
    }

    void property1() {
        System.out.println("i take the 10 hecter form");

    }
}

class madhav extends ganpat {

    public static void main(String[] args) {
        madhav form = new madhav();
        form.property();
        form.property1();
    }
}


