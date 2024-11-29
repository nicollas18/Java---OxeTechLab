import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Leitura2 {
  public static void main(String[] args) {

    ArrayList<Cliente> clientes = new ArrayList<>();
    
    try (BufferedReader leitor = new BufferedReader(new FileReader("files/clientes.txt"))) {

      String linha = leitor.readLine();

      while (linha != null) {
        String[] dados = linha.split(", ");
        String nome = dados[0].split(": ")[1];
        int idade = Integer.parseInt(dados[1].split(": ")[1]);

        Cliente novoCliente = new Cliente(nome, idade);
        clientes.add(novoCliente);

        linha = leitor.readLine();
      }

    } catch (IOException erro) {
      erro.printStackTrace();
    }

    for (Cliente cliente : clientes) {
      cliente.informacoes();
    }
  }
}

class Cliente {
  private String nome;
  private int idade;

  Cliente(String nome, int idade) {
    this.nome  = nome;
    this.idade = idade;
  }

  public void informacoes() {
    System.out.printf("Nome: %s\n", nome);
    System.out.printf("Idade: %d\n", idade);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  
}
