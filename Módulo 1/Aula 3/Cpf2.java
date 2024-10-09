import java.util.Scanner;

public class Cpf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String cpf = scan.nextLine();
        // 122.731.324-17
        
        // Remove caracteres não numéricos e converte para uma sequência de inteiros
        int soma = cpf.replaceAll("[^0-9]", "").chars().map(Character::getNumericValue).sum(); // Soma todos os números

        System.out.println(soma);
        scan.close();
    }
}
