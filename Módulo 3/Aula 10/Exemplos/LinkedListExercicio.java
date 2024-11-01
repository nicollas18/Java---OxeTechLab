package Exemplos;
import java.util.LinkedList;
import java.util.Scanner;

/*
Descrição: Crie um programa para gerenciar uma lista de tarefas usando LinkedList. O programa deve:

Adicionar uma nova tarefa ao final da lista.
Marcar a primeira tarefa como concluída e removê-la da lista.
Listar todas as tarefas pendentes.
Exibir a próxima tarefa a ser feita (primeiro elemento da lista).
 */

public class LinkedListExercicio {
    public static void main(String[] args) {
        LinkedList<String> tarefas = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1. Adicionar nova tarefa");
            System.out.println("2. Concluir primeira tarefa");
            System.out.println("3. Exibir tarefas pendentes");
            System.out.println("4. Mostrar próxima tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String tarefa = scanner.nextLine();
                    tarefas.addLast(tarefa); // Adiciona a tarefa ao final da lista
                    System.out.println("Tarefa adicionada: " + tarefa);
                    break;

                case 2:
                    if (!tarefas.isEmpty()) {
                        String tarefaConcluida = tarefas.removeFirst(); // Remove e retorna a primeira tarefa
                        System.out.println("Tarefa concluída: " + tarefaConcluida);
                    } else {
                        System.out.println("Não há tarefas pendentes.");
                    }
                    break;

                case 3:
                    System.out.println("Tarefas pendentes:");
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa pendente.");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + ". " + tarefas.get(i));
                        }
                    }
                    break;

                case 4:
                    if (!tarefas.isEmpty()) {
                        System.out.println("Próxima tarefa: " + tarefas.peekFirst());
                    } else {
                        System.out.println("Não há tarefas pendentes.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }
}
