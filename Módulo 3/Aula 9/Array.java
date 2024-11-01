import java.util.Arrays;

public class Array {
  public static void main(String[] args) {

    // Declaração e Inicialização

    int[] numeros1;
    numeros1 = new int[5];

    numeros1[0] = 5;
    numeros1[1] = 10;
    numeros1[2] = 15;
    numeros1[3] = 20;
    numeros1[4] = 25;

    int[] numeros2 = {10, 5, 30, 15};


    // Operações

    int tam = numeros1.length;

    System.out.println(tam);

    Arrays.sort(numeros2);
    System.out.println(Arrays.toString(numeros2));

    for (int i = 0; i < numeros1.length; i++) {
      System.out.println(numeros1[i]);
    }

    System.out.println();

    for (int numero : numeros1) {
      System.out.println(numero);
    } 
  }
}