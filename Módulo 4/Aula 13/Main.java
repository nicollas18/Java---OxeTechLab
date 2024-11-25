import models.Carro;

public class Main {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa();
    pessoa1.nome = "Maria";
    pessoa1.idade = 19;
    pessoa1.profissiao = "Enfermeira";

    pessoa1.apresentar();

    Pessoa pessoa2 = new Pessoa("Márcio", 22, "Engenheiro");
    pessoa2.apresentar();

    Carro carro1 = new Carro();
    
    carro1.acelar();
  }
}
