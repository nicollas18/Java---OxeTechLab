package Exemplos;

import java.util.HashMap;
import java.util.Scanner;

/*
Descrição: Crie um programa que armazene um registro de notas de alunos usando um HashMap. O programa deve permitir que o usuário insira o nome do aluno e sua respectiva nota. Após a entrada, o programa deve exibir todas as notas armazenadas.
 */

public class HashMapExercicio {
    public static void main(String[] args) {
        HashMap<String, Double> registroNotas = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String nome;

        while (true) {
            System.out.print("Digite o nome do aluno (ou 'sair' para encerrar): ");
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.print("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();
            scanner.nextLine();  // Limpar o buffer

            registroNotas.put(nome, nota);
            System.out.println("Nota adicionada para " + nome);
        }

        System.out.println("Registro de notas:");
        for (String aluno : registroNotas.keySet()) {
            System.out.printf("Aluno: %s, Nota: %.2f\n", aluno, registroNotas.get(aluno));
        }
        
        scanner.close();
    }
}