package Exemplos;

import java.util.Scanner;
import java.util.TreeSet;

/*
Descrição: Crie um programa que armazene uma lista de números inteiros usando um TreeSet. O programa deve permitir que o usuário insira números, exiba os números em ordem crescente e informe a soma total dos números.

 */

public class TreeSetExercicio {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        String entrada;
        int soma = 0;

        while (true) {
            System.out.print("Digite um número (ou 'sair' para encerrar): ");
            entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }
            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            }
        }

        System.out.println("Números em ordem crescente: " + numeros);
        
        for (int numero : numeros) {
            soma += numero;
        }
        
        System.out.println("Soma total dos números: " + soma);
        scanner.close();
    }
}
