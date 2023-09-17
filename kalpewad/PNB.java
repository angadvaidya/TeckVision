package kalpewad;

abstract class hdfc{
    abstract int getRateOfInterest();
    }
    class axis extends hdfc {
        int getRateOfInterest() {
            return 10;
        }
    }
    class national extends axis{
    int getRateOfInterested(){
        return 8;
    }
    }
    class sai{
        public static void main(String[] args) {
            national a=new national();
          //  a.getRateOfInterest();
            System.out.println("Rate of interest:"+a.getRateOfInterested());
            System.out.println("Rate of interest:"+a.getRateOfInterest());
        }
    }
