import java.util.Scanner;

public class Ex8 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("informe 2 valores: ");
        double valorA = ler.nextDouble();
        double valorB = ler.nextDouble();

        while(valorA < 0 || valorB == 0){
            System.out.println("Informe um valor maior que zero:");
            valorB = ler.nextDouble();
        }
        System.out.println("A divisão entre os dois valores é = " + valorA/valorB);
        ler.close();
    }
}
