import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escrita1 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    try (BufferedWriter escritor = new BufferedWriter(new FileWriter("files/clientes.txt"))) {
      String nome = scan.nextLine();
      int idade = scan.nextInt();

      scan.nextLine();

      escritor.write(String.format("Nome: %s, Idade: %d\n", nome, idade));

      nome = scan.nextLine();
      idade = scan.nextInt();

      escritor.write(String.format("Nome: %s, Idade: %d\n", nome, idade));

    } catch (IOException erro) {
      System.out.println(erro);
    }

    scan.close();
  }
}
