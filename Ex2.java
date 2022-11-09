import java.util.Scanner;

//Sempre colocar o mesmo nome da Pasta

public class Ex2 {
    public static void main (String[] args)
    {
        Scanner name = new Scanner(System.in);
        System.out.println("Me informe seu nome: ");
        String novo_nome = name.nextLine();
        System.out.println("Olá " + novo_nome + "!");
    }
}