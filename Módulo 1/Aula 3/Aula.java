public class Aula {
  public static void main(String[] args) {
    // int -> String
    int numeroInt = 10;
    String stringNumero = String.valueOf(numeroInt);

    System.out.println(stringNumero);
    System.out.println(numeroInt + numeroInt);
    System.out.println(stringNumero + stringNumero);

    // double -> String
    double numeroDouble = 21.7;
    stringNumero = String.valueOf(numeroDouble);

    System.out.println(stringNumero);
    System.out.println(numeroDouble + numeroDouble);
    System.out.println(stringNumero + stringNumero);

    // char -> String
    char caractere1 = 'A';
    char caractere2 = 'B';
    String Stringletra = String.valueOf(caractere1);

    System.out.println(caractere1);
    System.out.println(Stringletra);
    System.out.println(caractere1 + caractere2);
    System.out.println(Stringletra + Stringletra);
    
    // boolean -> String
    boolean status = true;
    String stringStatus = String.valueOf(status);

    System.out.println(status);
    System.out.println(stringStatus);
    //System.out.println(status + status);
    System.out.println(stringStatus + stringStatus);

    // String -> int
    stringNumero = "10";
    int numero = Integer.parseInt(stringNumero);

    System.out.println(numero);
    System.out.println(numero + numero);

    // char -> int
    char numeroChar = '5';
    numero = Character.getNumericValue(numeroChar);

    System.out.println(numero);

    // Extra
    String nome = "Jorge";

    char primeiraLetra = nome.charAt(0);

    System.out.println(primeiraLetra);
  }
}
