import java.util.Scanner;

public class Ex4AreaParalelograma {
  public static void main (String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Me informe a Base do Paralelograma: ");
    int base = ler.nextInt();
    System.out.println("Me informe a Altura do Paralelograma: ");
    int height = ler.nextInt();
    System.out.println("Base: " + base + " Altura: " + height + " Area: " + (base*height) + "²");
    }
}