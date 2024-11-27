public class Main {
  public static void main(String[] args) {
    Guerreiro guerreiro = new Guerreiro("Davi", 0, 0.0, 300);
    guerreiro.perfil();
    guerreiro.ataqueBasico();
    guerreiro.ataqueEspecial();
    guerreiro.defender();
    guerreiro.esquivar();
    guerreiro.comprarItem("Espada Nórdica", 450);
    guerreiro.venderItem("Escudo de Madeira", 250);

    System.out.println();

    Mago mago = new Mago("Harry", 0, 0.0, 500);
    mago.perfil();
    mago.ataqueBasico();
    mago.ataqueEspecial();
    mago.defender();
    mago.esquivar();
    mago.comprarItem("Cajado do Vazio" , 1450);
    mago.venderItem("Anel de Doran", 250);
  }
}