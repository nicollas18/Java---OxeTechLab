public class Personagem {
  private String nome;
  private int nivel;
  private double ataque;
  private double vida;
  private double ouro;

  Personagem(String nome, int nivel, double ataque, double vida, double ouro) {
    this.nome   = nome;
    this.nivel  = nivel;
    this.ataque = ataque;
    this.vida   = vida;
    this.ouro   = ouro;
  }

  public void informacoes() {
    System.out.printf("Nome: %s\nNivel: %d\nAtaque: %.2f\nVida: %.2f\nOuro: %.2f\n", nome, nivel, ataque, vida, ouro);
  }

  public void atacar() {
    System.out.println("Ataque genérico...");
  }

  public String getNome() {
    return nome;
  }

  public int getNivel() {
    return nivel;
  }

  public double getAtaque() {
    return ataque;
  }

  public double getVida() {
    return vida;
  }

  public double getOuro() {
    return ouro;
  }

  
}
