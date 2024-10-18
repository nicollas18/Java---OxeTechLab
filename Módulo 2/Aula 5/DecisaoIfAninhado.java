public class DecisaoIfAninhado {
  public static void main(String[] args) {
    // É possível usar o condicional if aninhado, mas cuidado, pois o código facilmente pode ficar confuso e difícil de entender.

    int numero = 9;

    if (numero > 0) {
      System.out.println("Positivo!");

      if (numero % 2 == 0) {
        System.out.println("Par!\n");
      }
    }

    if (numero > 0 && numero % 2 == 0) {
      System.out.println("Positivo!");
      System.out.println("Par!");
    }
  }
}
