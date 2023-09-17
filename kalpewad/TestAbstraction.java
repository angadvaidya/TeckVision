package kalpewad;

abstract class TestAbstraction {
    void draw(){
        System.out.println();
    }
}

class rectangal extends TestAbstraction{
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    void draw(){
        System.out.println("Drawing rectangal");
    }

}
class circle extends TestAbstraction{
    void draw(){
        System.out.println("Drawing circle");
    }

}
class Shape{
    public static void main(String[] args){
        TestAbstraction A=new rectangal();
        A.draw();
        A.draw();

    }

    }

