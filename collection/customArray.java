package collection;


import java.util.Arrays;

     class CustomArray {

        private static final int capacity = 10;
        private int size = 0;
        private Object element[] = {};

        CustomArray() {
            element = new Object[capacity];
        }

        public void add(Object e) {

            if (size == element.length) {

                increaseCapacity();

            }

            element[size++] = e;

        }

        public Object get(int index) {

            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();

            }

            return element[index];
        }

        public Object remove(int index) {

            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();

            }
            Object removeElement = element[index];

            for (int i = index; i < size - 1; i++) {

                element[i] = element[i + 1];

            }
            size--;

            return removeElement;
        }

        public void displayList() {
            System.out.print("List : ");
            for (int i = 0; i < size; i++) {
                System.out.print(element[i] + " ");
            }
            System.out.println();
        }

        private void increaseCapacity() {

            int increseCapacity = element.length * 2;
            element = Arrays.copyOf(element, increseCapacity);

        }

        public static void main(String[] args) {

            CustomArray list = new CustomArray();

            list.add(111);
            list.add(222);
            list.add("java");
            list.add("Neha");
            list.add(333);


            list.displayList();

            System.out.println(list.get(2));

            list.remove(1);

            list.displayList();



        }

    }


