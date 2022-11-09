import java.util.Scanner;

public class Ex4AreaQuadrado {
  public static void main (String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Me informe o Lado A do Quadrado: ");
    int ladoA = ler.nextInt();
    System.out.println("Me informe o Lado B do Quadrado: ");
    int ladoB = ler.nextInt();
    System.out.println("Area: " + (ladoA*ladoB) + "²");
    }
}