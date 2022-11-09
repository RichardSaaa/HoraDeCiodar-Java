import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("Me informe um numero: ");
        int valor = ler.nextInt();

        if (valor > 0) {
            System.out.print("Positivo negrao");
        } else if (valor == 0) {
            System.out.print("Esse numero e zero.");
        } else if (valor < 0) {
            System.out.print("Negativo");
        } 
        //else {
        //    System.out.print("Isso nao e um numero");
        //}
    }
}