import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        // O loop while te permite executar um bloco de código enquanto uma condição for verdadeira
        // O loop while é ideal para cenários onde não sabemos o número certo de iterações

        Scanner scan = new Scanner(System.in);

        // Imprimindo várias vezes com o while
        int i = 0;

        while (i < 5) {
            System.out.println("Olá, mundo!");
            i++;
        }

        // Imprimindo os valores de 0 a N;
        int j = 0, N = 45;

        while (j <= N) {
            System.out.println(j);
            j++;
        }

        // Lendo vários valores
        int k = 0;

        while (k < 5) {
            int numero = scan.nextInt();
            k++;
        }

        // Lendo valores até uma certa condição
        while (true) {

            int numero = scan.nextInt();

            if (numero == - 1) {
                break;

            } else {
                System.out.println("Ainda não terminou!");
            }
        }
    }
}
