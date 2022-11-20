package lesson3;

public class TestingFail {

    public static void main(String[] args) {


    }

    public static void print(int[][] puzzle) {
        for (int[] row : puzzle) {
            for (int elem : row) {
                System.out.printf("%4d", elem);
            }
            System.out.println();
        }
        System.out.println();
    }
}
