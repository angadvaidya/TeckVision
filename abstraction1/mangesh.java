package abstraction1;

abstract class mangesh {
    int a=10;
    int b=20;
    int c=30;
    abstract void sham();
}
class dinesh extends mangesh{
    void sham(){
        System.out.println("does not have body in abstract meathod");
    }
    void b(){
        System.out.println("if you want to the some thing body of abstract method");
    }

}
class soham extends dinesh{
    int show(){
        System.out.println("hello java");
        return 1;
    }

    public static void main(String[] args) {
        soham m=new soham();
        m.sham();
        m.b();
        m.show();
    }
}