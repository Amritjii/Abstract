package Patterns;
import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[][] matrix = 
        {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        
        System.out.println("Original matrix:");
        printMatrix(matrix);
        
        int[][] rotated = rotateMatrix(matrix);
        System.out.println("Rotated matrix:");
        printMatrix(rotated);
    }
    
    public static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n-1-i] = matrix[i][j];
            }
        }
        return rotated;
    }
    
    public static void printMatrix(int[][] matrix) 
    {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}

