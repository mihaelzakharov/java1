package lesson3;

public class HomeWorkForLessonThree {
    public static void main(String[] args) {

        var1Ex1();


    }

    public static void var1Ex1() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                arr[i] = 0;
            else arr[i] = 1;
        }

    }
}
