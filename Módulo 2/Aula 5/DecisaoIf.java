public class DecisaoIf {
  public static void main(String[] args) {
    // O condicional if permite que o programa tome decisões simples
    String nomeJogador = "Jotta";
    int nivel = 23;
    char rank = 'A';
    double ouro = 256.89;
    String elo = "Platina";

    // Note que, é possível usar os operadores lógicos para criar condições mais específicas, como delimitar um intervalo, por exemplo.

    if (nivel >= 20 && nivel <= 25) {
      System.out.println(nomeJogador + ", Seu Nível é Intermediário!");
    }

    if (rank == 'A' || rank == 'B') {
      System.out.println(nomeJogador + ", Seu Rank é alto!");
    }

    if (elo.equals("Platina")) {
      System.out.println(nomeJogador + ", Seu elo é acima de média!");
    }

    if (ouro >= 200.0) {
      System.out.println(nomeJogador + ", você pode comprar a espada samurai!");
    }

    // Ao lidar com caracteres podemos usar a tabela ASCII para realizar operações. Por exemplo 'A' < 'B';

    if ('A' < 'B') {
      System.out.println("B maior que A");
    }

    // A linhas da tabela ASCCI serão comparadas na conidção acima, onde A está na linha 65 e o B está na linha 66, logo A < B;
  }
}
