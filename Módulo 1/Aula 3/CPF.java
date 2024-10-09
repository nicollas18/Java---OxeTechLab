import java.util.Scanner;

public class CPF {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String cpf = scan.nextLine();
    // 122.731.324-17
    char caractere1  = cpf.charAt(0);
    char caractere2  = cpf.charAt(1);
    char caractere3  = cpf.charAt(2);
    char caractere4  = cpf.charAt(4);
    char caractere5  = cpf.charAt(5);
    char caractere6  = cpf.charAt(6);
    char caractere7  = cpf.charAt(8);
    char caractere8  = cpf.charAt(9);
    char caractere9  = cpf.charAt(10);
    char caractere10 = cpf.charAt(12);
    char caractere11 = cpf.charAt(13);

    int numero1   = Character.getNumericValue(caractere1);
    int numero2   = Character.getNumericValue(caractere2);
    int numero3   = Character.getNumericValue(caractere3);
    int numero4   = Character.getNumericValue(caractere4);
    int numero5   = Character.getNumericValue(caractere5);
    int numero6   = Character.getNumericValue(caractere6);
    int numero7   = Character.getNumericValue(caractere7);
    int numero8   = Character.getNumericValue(caractere8);
    int numero9   = Character.getNumericValue(caractere9);
    int numero10  = Character.getNumericValue(caractere10);
    int numero11  = Character.getNumericValue(caractere11);

    int soma = numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9 + numero10 + numero11;

    System.out.println(soma);

    scan.close();
  }
}
