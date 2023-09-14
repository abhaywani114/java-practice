class matrixAdd {
  public static void main(String[] argv) {
    int[][] matrix_1 = {
      {1, 2,  3},
      {4, 5,  6},
      {7, 8,  9}
    };
    int[][] matrix_2 = {
      {4,  5,  6},
      {43, 33, 22},
      {12, 16,  15}
    };
    int[][] result = new int[3][3];
    addMatrix(result, matrix_1, matrix_2);
    printMatrix(result); 
  }
  public static void printMatrix(int[][] matrix) {
    System.out.println("Matrix print:");
    for (int[] row:matrix) {
      for (int element:row) {
        System.out.print(element + "\t");
      }
      System.out.println();
    }
  }
  public static void addMatrix(int[][] result, int[][] matrix_1, int[][] matrix_2) {
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        result[i][j] = matrix_1[i][j] + matrix_2[i][j];
      }
    }
  }
}
