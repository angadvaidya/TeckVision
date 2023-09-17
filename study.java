public class study {
    static class Friend{
        private final String name;

        Friend(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
        public synchronized void bow(Friend bower){
            System.out.format("%s:%s has bow to me ! %n",this.name,bower.getName());
            bower.bowBack(this);
        }
        public synchronized void bowBack(Friend bower){
            System.out.format("%s:%s has bow to me ! %n",this.name,bower.getName());
            bower.bow(this);
        }

        }

    public static void main(String[] args) {
        final Friend alphonese=new Friend("Alphonese");
        final Friend gaston=new Friend("Gaston");
        new Thread(() -> alphonese.bow(gaston)).start();
        new Thread(() -> gaston.bow(alphonese)).start();

    }
    }

