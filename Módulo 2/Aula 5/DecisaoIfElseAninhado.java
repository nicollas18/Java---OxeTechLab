public class DecisaoIfElseAninhado {
  public static void main(String[] args) {
    // O if-else pode ser usado aninhado para chegar várias condições em sequência.
    int numero = 10;

    if (numero != 0) {
      System.out.println("O número não é zero!");
      if (numero > 0) {
        System.out.println("O número é positivo!");

      } else {
        System.out.println("O número é negativo!");
      }
      
    } else {
      System.out.println("O número é zero!");
    }
  }
}
