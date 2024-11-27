public class Guerreiro extends Personagem implements Luta, Loja {
  private int defesa;

  Guerreiro (String nome, int nivel, double ouro, int defesa) {
    super(nome, nivel, ouro);
    this.defesa = defesa;
  }

  // Métodos da Classes Abstrata
  public void ataqueBasico() {
    System.out.println("Ataque com espada!");
  }

  public void ataqueEspecial() {
    System.out.println("Golpe de espada pesado!");
  }

  // Polimorfismo
  @Override
  public void perfil() {
    System.out.println("Perfil do Guerreiro:");
    super.perfil();
    System.out.printf("Defesa: %d\n", defesa);
  }

  // Métodos da Interface Luta
  public void defender() {
    System.out.println("Bloqueio com o escudo!");
  }

  public void esquivar() {
    System.out.println("Rolamento Lateral!");
  }

  // Métodos da Interface Loja
  public void comprarItem(String item, double preco) {
    System.out.printf("O Guerreiro comprou %s por %.2f moeadas de ouro\n", item, preco);
  }
  public void venderItem(String item, double preco) {
    System.out.printf("O Guerreiro vendeu %s por %.2f moeadas de ouro\n", item, preco);
  }
}
