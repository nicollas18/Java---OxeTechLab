package Exemplos;

import java.util.Scanner;
import java.util.TreeMap;

/*
Descrição: Crie um programa que armazene uma lista de produtos e seus preços usando um TreeMap. O programa deve permitir que o usuário insira o nome do produto e seu respectivo preço. Após a entrada, o programa deve exibir todos os produtos em ordem alfabética, juntamente com seus preços.
 */

public class TreeMapExercicio {
    public static void main(String[] args) {
        TreeMap<String, Double> produtos = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String nomeProduto;

        while (true) {
            System.out.print("Digite o nome do produto (ou 'sair' para encerrar): ");
            nomeProduto = scanner.nextLine();
            if (nomeProduto.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.print("Digite o preço do produto: ");
            double preco = scanner.nextDouble();
            scanner.nextLine();  // Limpar o buffer

            produtos.put(nomeProduto, preco);
            System.out.println("Produto adicionado: " + nomeProduto);
        }

        System.out.println("Lista de produtos e preços:");
        for (String produto : produtos.keySet()) {
            System.out.printf("Produto: %s, Preço: %.2f\n", produto, produtos.get(produto));
        }
        
        scanner.close();
    }
}