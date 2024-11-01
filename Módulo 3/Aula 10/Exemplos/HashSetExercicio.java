package Exemplos;

import java.util.HashSet;
import java.util.Scanner;

/*
Descrição: Crie um programa que armazene uma lista de nomes de pessoas usando um HashSet. O programa deve permitir que o usuário insira nomes, verifique se um nome já está presente na coleção e exiba todos os nomes armazenados.
 */

public class HashSetExercicio {
    public static void main(String[] args) {
        HashSet<String> nomes = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String nome;

        while (true) {
            System.out.print("Digite um nome (ou 'sair' para encerrar): ");
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            if (nomes.contains(nome)) {
                System.out.println("O nome '" + nome + "' já foi adicionado.");
            } else {
                nomes.add(nome);
                System.out.println("Nome adicionado: " + nome);
            }
        }

        System.out.println("Nomes armazenados: " + nomes);
        scanner.close();
    }
}

