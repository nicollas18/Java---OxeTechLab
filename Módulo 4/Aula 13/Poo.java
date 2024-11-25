public class Poo {
  public static void main(String[] args) {

    Personagem personagem1 = new Personagem();
    personagem1.nome = "Jorginho";
    personagem1.vida = 500;
    personagem1.ataque = 40;
    personagem1.pular();

    Personagem personagem2 = new Personagem();
    personagem2.atacar();
  }
}

class Personagem {
  String nome;
  int vida;
  int ataque;

  public void atacar() {
    System.out.println("Soco!!!");
  }

  public void pular() {
    System.out.println("Pulou 5 metros.");
  }
}


