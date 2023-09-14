class matrixMul {
  public static void main(String[] argv) {
    int[][] matrix_1 = {
      {1,   2,    3},
      {4,   5,    6}
    };

    int[][] matrix_2 = {
      {10,  11},
      {20,  21},
      {30,  31}
    };
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
}
