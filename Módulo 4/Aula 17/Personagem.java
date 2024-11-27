public abstract class Personagem {
  private String nome;
  private int nivel;
  private double ouro;

  Personagem(String nome, int nivel, double ouro) {
    this.nome = nome;
    this.nivel = nivel;
    this.ouro = ouro;
  }

  // Método Abstrato
  abstract void ataqueBasico();
  abstract void ataqueEspecial();

  // Método Concreto
  public void perfil() {
    System.out.printf("Nome: %s\n", nome);
    System.out.printf("Nível: %s\n", nivel);
    System.out.printf("Ouro: %s\n", ouro);
  }

  public String getNome() {
    return nome;
  }

  
}
