public class Mago extends Personagem implements Luta{
  private int mana;

  Mago(String nome, int nivel, double ouro, int mana) {
    super(nome, nivel, ouro);
    this.mana = mana;
  }

  // Métodos da Classes Abstrata
  public void ataqueBasico() {
    System.out.println("Feitço Leve!");
  }

  public void ataqueEspecial() {
    System.out.println("Feitço Pesado!");
  }

  // Polimorfismo
  @Override
  public void perfil() {
    System.out.println("Perfil do Mago:");
    super.perfil();
    System.out.printf("Defesa: %d\n", mana);
  }

  // Métodos da Interface Luta
  public void defender() {
    System.out.println("Conjura um escudo mágico!");
  }

  public void esquivar() {
    System.out.println("Teleporta para escapar!");
  }

  // Métodos da Interface Loja
  public void comprarItem(String item, double preco) {
    System.out.printf("O Mago comprou %s por %.2f moeadas de ouro\n", item, preco);
  }
  public void venderItem(String item, double preco) {
    System.out.printf("O Mago vendeu %s por %.2f moeadas de ouro\n", item, preco);
  }
}
