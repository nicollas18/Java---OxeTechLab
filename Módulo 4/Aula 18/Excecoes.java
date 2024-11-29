public class Excecoes {
  public static void main(String[] args) {
    int[] numeros = {0, 10, 20, 30, 40};
    System.out.println("Mensagem Inicial");
  

    try { // Tentar
      System.out.println(numeros[6]);
      int resultado = numeros[3] /  numeros[0];
      System.out.println(resultado);

    } catch(ArrayIndexOutOfBoundsException erro) { // Pegar
      System.out.println("indice fora do limite do array!");
      System.out.println("Acessou o indice " + erro.getMessage());

    } catch (ArithmeticException erro) {
      System.out.println(erro.getMessage());
    }


    System.out.println("Mensagem Final");
     
  }
}
