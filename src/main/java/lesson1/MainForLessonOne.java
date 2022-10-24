package lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class MainForLessonOne    {

    public static void main(String[] args) {
        System.out.println("Hello World");
//        System.out.println("Hello World");
        printHello();
        printHello();
        printHello();
        testVars();
        checkApp();
    }
    static void printHello () {
        System.out.println("Привет!");
        System.out.println("Мы в классе MainForLessonOne");
        System.out.println("Методе PrintHello");
    }
    public static void testVars() {
        int varA;
        varA = 1;
        int varB = 1111222;
        System.out.println(varA - varB);

        int varC = 2222222;
        int varD = 1111222;
        System.out.println((double) varC / varD);

        double doubleA = 3.1;
        double doubleB = 10;
        System.out.println(doubleA / doubleB);

        char charA = 23456;
        char charB = 23457;
        System.out.println(charA);
        System.out.println(charB);
        System.out.println(charA + charB);
        System.out.println((char) (charA + charB));

        String strHello = "Hello";
        String strWorld = "World";
        System.out.println(strHello + ", " + strWorld + "!");
        System.out.println(strHello + ", " + strWorld + "!" + 3 + 5);
        System.out.println(strHello + ", " + strWorld + "!" + (3 + 5));

    }
    private static void checkApp() {
        int app = ThreadLocalRandom.current().nextInt(-1, 5);
        System.out.println("Школьник принес оценку: " + app);

        if (app == 5){
            System.out.println("Молодец! Так держать!");
        }
        else if (app ==4) {
            System.out.println("Молодец! Но ты можешь лучше!");
        }
//        else if (app ==3 || app == 2 || app == 1)
        else if (app >= 1 && app <= 3) {
            System.out.println("Готовь уроки лучше!");
        }
        else {
            System.out.println("Не мухлюй!");
        }
        System.out.println("Проверка дневника закончена");

    }

}

