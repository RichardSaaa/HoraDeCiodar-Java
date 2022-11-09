import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Me informe a Base Maior do Trapezio: ");
    int baseMaior = ler.nextInt();
    System.out.println("Me informe a Base Menor do Trapezio: ");
    int baseMenor = ler.nextInt();
    System.out.println("Me informe o valor H: ");
    int valorH = ler.nextInt();
    System.out.println("Area: " + (baseMaior+baseMenor)*valorH/2);
    }
}