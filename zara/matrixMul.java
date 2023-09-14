import java.util.Scanner;
/*
 [1 2 3
  4 5 6
  7 8 9
 ] 3 x 3
 [
  10 11 12
  13 14 15
  16 17 18
 ] 3 x 3
 matix: r1, c1,
 matrx: r2, c2
 c1 == r2
 r1 x c2

*/
class matrixMul {
  public static void main(String[] argv) {
 
    int[][] matrix_1 = getMatrx();
    int[][] matrix_2 = getMatrx();

    int[][] result = new int[matrix_1.length][matrix_2[0].length];
    
    if (matrix_1[0].length != matrix_2.length) {
      System.out.println("Uncompatible matrix for multiplication");
      return;
    }
    multiplication(result, matrix_1, matrix_2);
    printMatrix(result);
  }
  public static void multiplication(int[][] result, int[][] matrix_1, int[][] matrix_2) {
   for (int i = 0; i < matrix_1.length; i++) {
      for (int j = 0; j < matrix_2[0].length; j++) {
        result[i][j] = 0;
        for (int k = 0; k < matrix_1[0].length; k++) {
          result[i][j] += matrix_1[i][k] * matrix_2[k][j];
        }
      }
    } 
  }
  public static void printMatrix(int[][] matrix) {
    System.out.println("Matrix is: ");
    for(int[] row:matrix) {
      for(int element:row) {
        System.out.print(element + "\t");
      }
      System.out.println();
    }
  }
  public static int[][] getMatrx() {
       
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter rows for matrix: ");
    int row = keyboard.nextInt();
    System.out.println("Enter col for matrix: ");
    int col = keyboard.nextInt();
    System.out.println("Enter elements for your matrix:");
    int[][] matrix = new int[row][col];
    for(int i = 0; i < row; i++) {
      for(int j = 0; j < col; j++) {
        matrix[i][j] = keyboard.nextInt();
      }
    }
    return matrix;
  }
}
