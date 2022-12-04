package ua.ithillel;

public class ArraysUtils {
    public static float average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (float) sum / array.length;
    }

    public static boolean isMatrixSquare(int[][] array) {
        printMatrix(array);
        if (array.length == 0) {
            return false;
        }

        return (array[0].length == array.length) ? true : false;

    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
