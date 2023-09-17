package kalpewad;

abstract class Finance {
    abstract int show();
}

class shriramfinancee extends Finance{

    int show() {
        return 9;
    }

}

class Bajajfinance extends shriramfinancee {
    int show1() {
        return 10;
    }
}
class panjab extends Bajajfinance {
    int show()
    {
        return 5;
    }
        }
        class allfinance{
            public static void main(String[] args) {
                shriramfinancee k= new shriramfinancee ();
                System.out.println("shriramfinancee     "+ "getRateOfInterest   "+k.show()+"%");
                Bajajfinance j=new Bajajfinance();
                System.out.println("bajajfinance    "+ "getRateOfInterest   "+j.show1()+"%");
            }
        }
