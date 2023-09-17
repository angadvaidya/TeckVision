package String;

public class stringbilder {
    public static void main(String[] args) {
        String[] arr = {"Hello", " java"};
        StringBuilder reversed = new StringBuilder();
        for (int i = arr.length; i > 0; i--) {
            reversed.append(arr[i -1]).append(" ");
        }
    }}
/*
        String[] reversedArray = reversed.toString().split(" ");
        System.out.println(Arrays.toString(reversedArray));
    }
}
    public static void main (String[] args) {
        String[] arr = {"Hello", "World"};
        StringBuilder reversed = new StringBuilder();

        for (int i = arr.length; i > 0; i--) {
            reversed.append(arr[i - 1]).append(" ");
        };

        String[] reversedArray = reversed.toString().split(" ");

        System.out.println(Arrays.toString(reversedArray));
    }
}


*/



