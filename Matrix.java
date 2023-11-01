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
    for(int i = 0; i < size; i++) {
      for(int j = 0; j < size; j++) {

        //printing the untouched diagonal in yellow
        if((i + j) == (size - 1)) {
          System.out.print(ANSI_YELLOW + "\t" + matrix[i][j] + ANSI_RESET);
        } else {
          System.out.print("\t" + matrix[i][j]);
        }
      }
      System.out.println();
    }
  }

  public void populateMatrix() {
    for(int i = 0; i < size; i++) {
      for(int j = 0; j < size; j++) {
        matrix[i][j] = (i * size) + j + 1;
      }
    }
  }

  public void flipMatrix() {
    int currentImmutable = size - 1;

    for(int i = 0; i < (size / 2); i++) {
      for(int j = 0; j < size; j++) {
        swap(i, j, ((size - 1) - i), ((size - 1) - j));

        //reseting the diagonal we don't want to change
        if(j == currentImmutable) {
          swap(i, j, ((size - 1) - i), ((size - 1) - j));
          currentImmutable--;
        }
      }
    }
  }
}
