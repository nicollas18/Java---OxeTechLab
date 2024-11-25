import java.util.ArrayList;

public class Pessoa {
  private String nome;
  private int idade;
  private double altura;
  //ArrayList<String> tarefas;

  Pessoa(String nome, int idade, double altura) {
    this.nome   = nome;
    this.idade  = idade;
    this.altura = altura;
    //this.tarefas = new ArrayList<>();
  }

  public void apresentacao() {
    System.out.printf("Olá, meu nome é %s, tenho %d anos e %.2fcm de altura.\n", nome, idade, altura);
  }

  // Set
  public void setIdade(int idade) {
    if (idade >= 0) {
      this.idade = idade;
      System.out.println("Idade alterada com sucesso!");
    } else {
      System.out.printf("%d não é uma idade válida!\n", idade);
    }
  }

  // Get
  public String getNome() {
    return this.nome;
  }
}
