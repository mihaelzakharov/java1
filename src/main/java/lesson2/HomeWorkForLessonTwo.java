package lesson2;

public class HomeWorkForLessonTwo {

    public static void main(String[] args) {
       boolean trueOrNot = within10and20 (2, 22);
        System.out.println(trueOrNot);

        isPositiveOrNegative(-7);

        boolean forScreen = isNegative(12446);
        System.out.println(forScreen); // в задаче нет,но выведение в консоль нагляднее показывает работу метода//

        printWordNTimes ("Задача написать слово word 10 раз", 10);
    }

    public static boolean within10and20(int x, int y) {

       int summ = x + y;

        if (summ >= 10 && summ <= 20) {
            System.out.println("Сумма чисел " + x + " и " + y + " лежит в пределах от 10 до 20");
            return true;
        }

        else {
            System.out.println("Сумма чисел " + x + " и " + y + " не лежит в пределах от 10 до 20");
            return false;
        }
    }

    public static void isPositiveOrNegative(int x) {

        if (x >= 0) {
            System.out.println("Мы передали положительное число " + x);
        }
        else {
            System.out.println("Мы передали отрицательное число " + x);
        }
    }

    public static boolean isNegative(int x) {
        return x >= 0;
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i <= times; i++) {
            System.out.println(word);
        }
    }



}
