package Exemplos;
import java.util.ArrayList;
import java.util.Scanner;

/*
Descrição: Crie um programa que armazena uma lista nomes usando um ArrayList. O programa deve:

Permitir ao usuário adicionar um novo nome.
Permitir ao usuário remover um nome específico da lista.
Permitir ao usuário ver todos os nomes da lista.
 */

public class ArrayListExercicio {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1. Adicionar nome");
            System.out.println("2. Remover nome");
            System.out.println("3. Exibir lista de nomes");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    nomes.add(nome); // Adiciona o nome à lista
                    System.out.println("Nome adicionado: " + nome);
                    break;

                case 2:
                    System.out.print("Digite o nome a ser removido: ");
                    String nomeRemover = scanner.nextLine();
                    if (nomes.remove(nomeRemover)) {
                        System.out.println("Nome removido: " + nomeRemover);
                    } else {
                        System.out.println("Nome não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Lista de nomes:");
                    if (nomes.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println((i + 1) + ". " + nomes.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}
