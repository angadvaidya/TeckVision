package interface1;

@FunctionalInterface
public interface abc {
    void show();

    default void sho() {

    }



}
class a implements abc {
    @Override
    public void show() {
        System.out.println("first method is overide");
    }
   public void sho(){
       System.out.println("first method is test");

    }
        }
  class b implements abc{
    @Override
      public void show(){
        System.out.println("second method is override");
    }
    public void sho(){
        System.out.println("second method is test");
    }
  }
  class c implements abc{
    @Override
      public void show(){
        System.out.println("third method is ovearide");

    }
      public void sho(){
          System.out.println("c method is test");
      }

  }
  class d implements abc {
      @Override
      public void show() {
          System.out.println("go back");

      }
      public void sho(){
          System.out.println("second method is test");
      }


      public static void main(String[] args) {
        c t=new c();
        t.show();
        t.sho();

      }

  }

