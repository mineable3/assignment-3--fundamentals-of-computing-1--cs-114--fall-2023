import java.util.InputMismatchException;
import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {

    int size;
    Scanner scan  = new Scanner(System.in);

    System.out.print("\n\tPlease enter the size of your matrix: ");

    try {
      size = scan.nextInt();
      scan.close();
    } catch (Exception e) {
      scan.close();
      throw new InputMismatchException("Input must be an int");
    }

    System.out.printf("\n\tYour matrix is %d x %d\n", size, size);

    Matrix h = new Matrix(size);

    System.out.println("\n\tPrinting matrix with default values:");
    h.printMatrix();

    System.out.println("\n\tPopulating matrix...matrix populated");
    h.populateMatrix();

    System.out.println("\n\tPrinting matrix:");
    h.printMatrix();

    System.out.println("\n\tFlipping matrix...matrix flipped");
    h.flipMatrix();

    System.out.println("\n\tPrinting flipped matrix:");
    h.printMatrix();
  }
}
