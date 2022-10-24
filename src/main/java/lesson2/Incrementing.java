package lesson2;

public class Incrementing {
    public static void main(String[] args) {
        test0();
    }

    public static void test0 () {
        int a = 5;
        System.out.println(a);
        System.out.println(a + 1);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(++a + 5);
        System.out.println(a++ - 5);
    }



}
