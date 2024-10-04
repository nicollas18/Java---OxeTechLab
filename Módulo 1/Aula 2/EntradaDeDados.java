import java.util.Scanner;

public class EntradaDeDados {
  public static void main(String[] args) {

    // Para ler dados do usuário vamos utilizar a classe Scanner que está dentro do pacote java.util e para isso precisamos fazer a importação (linha 1).

    Scanner entrada = new Scanner(System.in); // Criando um objeto Scanner

    byte tipoByte;
    short tipoShort;
    int tipoInt;
    long tipoLong;
    float tipoFloat;
    double tipoDouble;
    char tipoChar;
    boolean tipoBoolean;
    String tipoString;

    tipoByte    = entrada.nextByte();
    tipoShort   = entrada.nextShort();
    tipoInt     = entrada.nextInt();
    tipoLong    = entrada.nextLong();
    tipoFloat   = entrada.nextFloat();
    tipoDouble  = entrada.nextDouble();
    entrada.nextLine(); 
    // Quando você faz a leitura de um número ou outro tipo de dado antes de ler a string, o caractere de nova linha (\n) gerado ao pressionar "Enter" não é consumido. Isso faz com que o nextLine() capture esse caractere, resultando em uma string vazia. Por isso usamos a instrução entrada.nextLine() para consumir o caractere de nova linha que ficou no buffer.
    tipoString  = entrada.nextLine();
    tipoBoolean = entrada.nextBoolean();
    tipoChar    = entrada.next().charAt(0);

    System.out.println();
    System.out.println(tipoByte);
    System.out.println(tipoShort);
    System.out.println(tipoInt);
    System.out.println(tipoLong);
    System.out.println(tipoFloat);
    System.err.println(tipoDouble);
    System.out.println(tipoString);
    System.err.println(tipoBoolean);
    System.out.println(tipoChar);

    entrada.close(); 
    // Após terminar de usar o objeto "entrada" é uma boa prática de programação usar o método close 
  
  }
}
