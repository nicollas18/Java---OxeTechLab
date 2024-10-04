public class SaidaDeDados {
  public static void main(String[] args) {
    // Usando o System.out.println()
    System.out.println("Estou escrevendo na tela!");

    int numero = 10;
    System.out.println(numero);

    // Usar o comando abreviado sout para escrever System.out.println de forma rápida


    // Usando o System.out.print()
    System.out.print("Estou escrendo tudo na mesma linha! ");
    System.out.print("Viu?!\n"); // O \n serve para pular uma linha


    // Usando o Sytem.out.printf()
    System.out.printf("O que muda?");

    double pi = 3.14159;
    System.out.printf("O valor de pi é %.2f\n", pi); 

    // O %f específica que vamos imprimir o valor como um float e o .2 indica que queremos imprimir duas casas decimais depois da vírgula

    // %d para inteiros
    // %c para char
    // %b para booleanos
    // %s para strings

    // O operador + é usado para concatenar informações na saída
    double preco = 10.00;
    double precoDesconto = 9.00;
    System.out.println("O preço do produto é " + preco + ", mas fica por " + precoDesconto + " se for comprado à vista");


    
  }
}
