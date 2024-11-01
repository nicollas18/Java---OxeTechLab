import java.util.Arrays;
import java.util.Scanner;

public class TiposArray {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    // Unidimensionais 
    char[] letras = {'a', 'b', 'c'};
    String[] palavras = {"Ola", "Tudo bem ?", "KKKK"};
    double[] reais = {4.4, 5.6, 7.6};

    // Bidimensionais
    int[][] matriz = new int[3][3];

    /*for (int i = 0; i < matriz.length; i++) {
      for (int j = 0 ; j < matriz.length; j++) {
        int numero = scan.nextInt();
        matriz[i][j] = numero;
      }
    }*/

    System.out.println(Arrays.deepToString(matriz));

    String[][] frases = {{"ola", "tudo bem"}, {"meu nome é", "nicollas"}};

    System.out.println(Arrays.deepToString(frases));

    // Tridimensioanais
    int[][][]cubo = {
      {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
      {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
      {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
    };

    System.out.println(Arrays.deepToString(cubo));
    System.out.println(Arrays.deepToString(cubo[0]));

    // Irregulares
    int[][] irregular = new int [3][];

    irregular[0] = new int[2];
    irregular[1] = new int[4];
    irregular[2] = new int[3];


    for (int i = 0; i < irregular.length; i++) {
      for (int j = 0; j < irregular[i].length; j++) {
        System.out.println("-");
      }
      System.out.println();
    }

    
    }
}
