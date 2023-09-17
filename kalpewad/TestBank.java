package kalpewad;

abstract class TestBank{
    abstract int getRateOfInterest();
}
class BOI extends TestBank{
    int getRateOfInterest(){
        return 7;
    }
}
class PNB extends BOI {
    int getRateOfInterest() {
        return 8;
    }

        public static void main(String[]args){
        BOI b=new BOI();
         PNB b1=new PNB();
        b.getRateOfInterest();
            b1.getRateOfInterest();
            System.out.println("Reat of intrest:"+b.getRateOfInterest()+"%");
            System.out.println("Rate of intrest"+b1.getRateOfInterest()+"%");

        }

    }

