import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Escrita2 {
  public static void main(String[] args) {

    ArrayList<Cliente> clientes = new ArrayList<>();
    
    clientes.add(new Cliente("João", 14));
    clientes.add(new Cliente("Clara", 16));

    for (Cliente cliente : clientes) {

      try (BufferedWriter escritor = new BufferedWriter(new FileWriter("files/clientes.txt", true))) {

        escritor.write(String.format("Nome: %s, Idade: %d\n", cliente.getNome(), cliente.getIdade()));

      } catch (IOException erro) {
        System.out.println(erro);
      }
    }

  }
}

class Cliente {
  private String nome;
  private int idade;

  Cliente(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
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