import java.util.Arrays;

public class Lesson15Program {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();

        int[][] matrix1 = new int[5][5];
        int[][] matrix2 = new int[][]{{1, 2, 3}, {1, 2, 3, 4}, {1, 2, 3}};
        int[][] matrix3 = null;
        int[][] matrix4 = new int[0][0];
        int[][] matrix5 = new int[5][6];

        int[] array = {3, 2, 3, 4, 5};
        System.out.println(matrix.avgArray(array));

        for (int[] arr :
                matrix1) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(matrix.isMatrixSquare(matrix1));
        System.out.println(matrix.isMatrixSquare(matrix2));
        System.out.println(matrix.isMatrixSquare(matrix3));
        System.out.println(matrix.isMatrixSquare(matrix4));
        System.out.println(matrix.isMatrixSquare(matrix5));
    }
}
