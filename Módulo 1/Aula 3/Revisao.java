import java.util.Scanner;
import java.util.Locale;

public class Revisao {
  public static void main(String[] args) {

    int numero = 10;

    float salario = 1234.90F;
    long valor = 400000L;

    /********************************/

    Locale.setDefault(Locale.US);

    Scanner scan = new Scanner(System.in);

    int inteiro;
    double decimal;
    inteiro = scan.nextInt();
    System.out.println(inteiro);
    decimal = scan.nextDouble();
    System.out.println(decimal);

    /********************************/
    
    int idade;
    double altura;
    String nome;

    idade = scan.nextInt();
    altura = scan.nextDouble();
    scan.nextLine(); // Ler o ENTER
    nome = scan.nextLine();

    System.out.println(idade);
    System.out.println(altura);
    System.out.println(nome);

    scan.close();
  }
}
