public class DecisaoSwitch {
  public static void main(String[] args) {
    // A estrutura switch é útil quando se deseja testar uma única variável contra múltiplos valores possíveis.

    // A instrução break termina a execução do bloco de código do case atual e impede que o controle passe para o próximo case.

    //  bloco default é opcional, mas é uma boa prática incluí-lo para lidar com valores inesperados.

    int mes = 3;

    switch (mes) {
      case 1:
        System.out.println("Janeiro.");
        break;
      case 2:
        System.out.println("Fevereiro");
        break;
      case 3:
        System.out.println("Março.");
        break;
      default:
        System.out.println("Mes Inválido!");
        break;
    }

    // É possível usar um char como variável para testar múltiplos valores. 

    char rank = 'A';

    switch (rank) {
      case 'S':
        System.out.println("Você é SUPREMO!"); 
        break;
      case 'A':
        System.out.println("Você é Mestre.");
        break;
      case 'B':
        System.out.println("Você é Elite");
        break;
      case 'D':
        System.out.println("Você é Novato");
      default:
        System.out.println("Rank Inválido");
        break;
    }

    // É possível usar uma String como variável para testar múltiplos valores.

    String dia = "Domingo";

    switch (dia) {
      case "Domingo":
        System.out.println("É final de semana!");
        break;
      case "Segunda":
        System.out.println("É dia de semana.");
        break;
      default:
        System.out.println("Dia Inválido");
        break;
    }

    switch (dia) {
      case "Domingo":
        System.out.println("É final de semana!");
        break;
      case "Segunda":
        System.out.println("É dia de semana.");
        break;
      default:
        System.out.println("Dia Inválido");
        break;
    }

    //Não é possível usar float ou double.
  }
}
