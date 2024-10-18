import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        // O loop for te permite executar um bloco de código específico, caso um certa condição seja verdadeira.
        // O for é ideal para cenários onde se sabemos o número de iterações

        //Imprimindo 5 vezes sem usar for
        System.out.println("Olá, mundo!");
        System.out.println("Olá, mundo!");
        System.out.println("Olá, mundo!");
        System.out.println("Olá, mundo!");
        System.out.println("Olá, mundo!\n");

        //Imprimindo 5 vezes usando o for
        // sintaxe: for (inicialização; condição; atualização)
        for (int i = 0; i < 5; i++) {
            System.out.println("Olá, mundo!");
        }

        // Imprimir os valores de 1 a 5;
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Imprimir os valores de 1 a N;
        int N = 34; // Pedir o valor o usuário;

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        // Lendo múltiplos valores sem usar for
        Scanner scan = new Scanner(System.in);
        int n1, n2, n3, n4, n5;

        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();
        n4 = scan.nextInt();
        n5 = scan.nextInt();

        //Lendo múltiplos valores com o for
        for (int i = 0; i < 5; i++) {
            int valor = scan.nextInt();
        }

         //Juntando as estrutura de decisão e repetição
        for (int i = 0; i < 5; i++) {
            String nomeUsuario;
            double salario, cartao;

            nomeUsuario = scan.nextLine();
            salario = scan.nextDouble();
            cartao = scan.nextDouble();

            if (salario - cartao >= 1500.0) {
                System.out.println(nomeUsuario + ", você pode pegar um empréstimo");

            } else {
                System.out.println(nomeUsuario + ", você não pode pegar um empréstimo");
            }
            scan.nextLine();
        }

        // Soma de N números;
        int n = scan.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++) {
            int numero = scan.nextInt();

            soma = soma + numero;
        }

        System.out.println(soma);
    }
}
