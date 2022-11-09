import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args) 
    {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Informe sua idade: ");
        int idade = ler.nextInt();
        System.out.println("Ola " + nome + " entao voce tem " + idade + "anos !");
    }
}