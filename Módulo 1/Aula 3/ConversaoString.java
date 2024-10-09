public class ConversaoString {
  public static void main(String[] args) {

    // Conversão de int para String
    int numeroInt = 10;
    String stringNumero = String.valueOf(numeroInt);

    System.out.println(stringNumero);

    // Conversão de double para String
    double numeroDouble = 21.7;
    stringNumero = String.valueOf(numeroDouble);

    System.out.println(stringNumero);

    // Conversão de char para String
    char caractere = 'A';
    String letra = String.valueOf(caractere);

    System.out.println(letra);

    // Conversão de boolean para String
    boolean status = true;
    String stringStatus = String.valueOf(status);

    System.out.println(stringStatus);

    
    // Conversão de uma String para um int (nem sempre é possível)
    stringNumero = "10";
    int numero = Integer.parseInt(stringNumero);

    System.out.println(numero);

    // Conversão de um char para um int
    char numeroChar = '5';
    int valor = Character.getNumericValue(numeroChar);

    System.out.println(valor);
  }
}
