public class granparent {
    granparent(int a, float b) {
        System.out.println("granparent is constructor");
    }

    granparent() {
        System.out.println("granparent is not constructor");
    }
}

class parentclass extends granparent {
    parentclass() {
        System.out.println("parentclass is not constructor");
    }

    void parentclass() {
        System.out.println("parentclass is  constructor");
    }
}

class childclass extends parentclass {
     childclass(){
        System.out.println("child class is not paratmeter");
    }

    childclass(int a, int v) {
        System.out.println("child class is parameter constructor");
    }

    public static void main(String[] args) {
        childclass name = new childclass();

    }
}


