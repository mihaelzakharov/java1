package lesson3;

public class HomeWorkForLesson3 {

    public static void main(String[] args) {

        var1Ex1();
        System.out.println();
        var1Ex2();
        System.out.println();
        var1Ex3();
        System.out.println();
        var1Ex4();
        System.out.println();
        var1Ex5(10, 8);

    }

        public static void var1Ex1() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                arr[i] = 0;
            else arr[i] = 1;
            System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        public static void var1Ex2 () {
            int[] array = new int[100];
            for (int i = 0; i < array.length; i++) {
            array [i] = i + 1;

            System.out.print(array[i] + " ");
            }

        }
        public static void var1Ex3() {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] = arr[i] * 2;
                }
        System.out.print(arr[i] + " ");
            }
        }

        public static void var1Ex4() {
            int[][] arr = new int[4][4];
                for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == j) {
                    arr[i][j] = 1;
                    }
                System.out.print(arr[i][j] + " ");
                }
            System.out.println();
            }
        }
        public static void var1Ex5(int len, int initialValue){
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
            }
        }



}






