import java.util.Scanner;

public class Ex4AreaLosango {
  public static void main (String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Me informe a Diagonal Maior do Losango: ");
    int diagonalmaior = ler.nextInt();
    System.out.println("Me informe a Diagonal Menor do Losango: ");
    int diagonalmenor = ler.nextInt();
    System.out.println("Diagonal Maior: " + diagonalmaior + " Diagonal Menor: " + diagonalmenor + " Area: " + (diagonalmaior*diagonalmenor/2) + "²");
    }
}