public class Matrix {

  private int size;
  private int[][] matrix;
  private final String ANSI_RESET = "\u001B[0m";
  private final String ANSI_YELLOW = "\u001B[33m";

  public Matrix(int _size) {
    matrix = new int[_size][_size];
    size = _size;
  }

  private void swap(int x1, int y1, int x2, int y2) {
    int originalValue = matrix[x1][y1];
    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = originalValue;
  }

  public void printMatrix() {
    for(int row = 0; row < size; row++) {
      for(int column = 0; column < size; column++) {

        //printing the untouched diagonal in yellow
        if((row + column) == (size - 1)) {
          System.out.print(ANSI_YELLOW + "\t" + matrix[row][column] + ANSI_RESET);
        } else {
          System.out.print("\t" + matrix[row][column]);
        }
      }
      System.out.println();
    }
  }

  public void populateMatrix() {
    for(int row = 0; row < size; row++) {
      for(int column = 0; column < size; column++) {
        matrix[row][column] = (row * size) + column + 1;
      }
    }
  }

  public void flipMatrix() {

    for(int row = 0; row < (size / 2); row++) {
      for(int column = 0; column < size; column++) {
        swap(row, column, ((size - 1) - row), ((size - 1) - column));

        //reseting the diagonal we don't want to change
        if(column == (size - row - 1)) {
          swap(row, column, ((size - 1) - row), ((size - 1) - column));
        }
      }
    }

    //swapping the middle row of an odd matrix
    if((size % 2) != 0) {
      for(int column = 0; column < (size - 1) / 2; column++) {
        swap((int)(size / 2), column, (int)(size / 2), ((size - 1) - column));
      }
    }
  }
}
