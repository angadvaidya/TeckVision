package java8f;

interface interfaceobject{
    void show();
}
class display {
    public static void main(String[] args) {
        interfaceobject dock = () -> System.out.println("it is the lembda exprestion");
        dock.show();
    }
}
