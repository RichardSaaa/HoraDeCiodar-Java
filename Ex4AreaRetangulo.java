import java.util.Scanner;

public class Ex4areaRetangulo {
  public static void main (String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Me informe o Lado A do Retangulo: ");
    int base = ler.nextInt();
    System.out.println("Me informe o Lado B do Retangulo: ");
    int altura = ler.nextInt();
    System.out.println("Area: " + (base*altura));
    }
}