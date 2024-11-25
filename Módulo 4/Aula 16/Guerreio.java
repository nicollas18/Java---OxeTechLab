public class Guerreio extends Personagem {
  private double defesa;

  Guerreio(String nome, int nivel, double ataque, double vida, double ouro, double defesa) {
    super(nome, nivel, ataque, vida, ouro);
    this.defesa = defesa;
  }

  public void proteger() {
    System.out.println("Aliado protegido!");
  }

  @Override
  public void atacar() {
    System.out.println("Ataque com espada...");
  }

  public void informacoes() {
    System.out.printf("Nome: %s\nNivel: %d\nAtaque: %.2f\nVida: %.2f\nOuro: %.2f\nDefesa: %.2f\n", getNome(), getNivel(), getAtaque(), getVida(), getOuro(), defesa);
  }
}
