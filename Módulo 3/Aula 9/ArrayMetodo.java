import java.util.Arrays;

public class ArrayMetodo {
  public static void main(String[] args) {

    // Arrays como parâmetro de funções
    
    int[] numeros = {20, 40, 30, 70, 10};

    int maior = maiorNumero(numeros);

    System.out.println(maior);


    // Arrays como retorno de funções
    int[] valores = {2, 4, 5, 6, 9, 10, 11, 34};
    int[] pares = new int[valores.length];

    pares = numerosPares(valores);

    System.out.println(Arrays.toString(pares));
  }

  public static int maiorNumero(int[] numeros) {
    int maior = 0;

    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] > maior) {
        maior = numeros[i];
      }
    }

    return maior;
  }

  public static int[] numerosPares(int[] numeros) {
    int[] pares = new int[numeros.length];

    for (int i = 0,  j = 0; i < numeros.length; i++) {
      if (numeros[i] % 2 == 0) {
        pares[j] = numeros[i];
        j++;
      }
    }

    return pares;
  }
}
