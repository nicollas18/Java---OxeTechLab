public class Pessoa {
  String nome;
  int idade;
  String profissiao;

  Pessoa() {

  }

  Pessoa(String nome, int idade, String profissao) {
    this.nome = nome;
    this.idade = idade;
    this.profissiao = profissao;
  }

  public void apresentar() {
    System.out.println("Olá, meu nome é " + nome);
  }
}
