package java8f;
// Java program to demonstrate Implementation of
// functional interface using lambda expressions

public class LambdaExpresion {
    public static void main(String[] args) {
        // lambda expression to create the object

        new Thread(()-> {
            System.out.println("functional interface are include java 8 with lambda Expresion and method " +
                    "references in order to make code more readble,clean staightforward");
        }
     ).start();
    }
}
