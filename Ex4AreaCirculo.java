import java.util.Scanner;

public class Ex4AreaCirculo {
  public static final float PI = 3.14F;
  public static void main (String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("Me informe o Raio do Circulo: ");
    int raio = ler.nextInt();
    System.out.println("Area do circulo e: " + ((raio*raio)*PI));    
    }
}