import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Matrix h = new Matrix(8);

    System.out.println();
    h.printMatrix();
    System.out.println();
    h.populatMatrix();
    h.printMatrix();
    System.out.println();
    h.flipMatrix();
    h.printMatrix();
  }
}
