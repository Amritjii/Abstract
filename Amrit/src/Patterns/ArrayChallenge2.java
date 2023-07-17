package Patterns;

import java.util.Scanner;

public class ArrayChallenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Original matrix:");
        printMatrix(matrix);

        int[][] transposed = transposeMatrix(matrix);
        System.out.println("Transposed matrix:");
        printMatrix(transposed);
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transposed = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
