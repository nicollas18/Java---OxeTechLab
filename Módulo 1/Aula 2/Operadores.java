public class Operadores {
  public static void main(String[] args) {

    // Operador de Atribuição
    int numero = 10;

    // Operadores Aritméticos: + - * / %
    int numero1 = 5, numero2 = 2;
    int soma, subtracao, multiplicao, divisao, resto;

    System.out.println("Operadores Aritméticos");
    soma        = numero1 + numero2;
    subtracao   = numero1 - numero2;
    multiplicao = numero1 * numero2;
    divisao     = numero1 / numero2; // 2.5
    resto       = numero1 % numero2;

    System.out.println(soma);
    System.out.println(subtracao);
    System.out.println(multiplicao);
    System.out.println(divisao);
    System.out.println(resto);

    // Operadores Artiméticos de Atribuição
    int i = 1;

    i += 3; // i = i + 3
    i -= 3; // i = i - 3;
    i *= 3; // i = i * 3;
    i /= 3; // i = i / 3;
    i %= 3; // i = i % 3;
    

    // Operadores Relacionais (retornam true ou false)
    System.out.println("Operadores Relacionais");
    boolean igualdade  = (numero1 == numero2);
    boolean diferente  = (numero1 != numero2);
    boolean maiorQue   = (numero1 > numero2);
    boolean menorQue   = (numero1 < numero2);
    boolean maiorIgual = (numero1 >= numero2);
    boolean menorIgual = (numero1 <= numero2);

    System.out.println(igualdade);
    System.out.println(diferente);
    System.out.println(maiorQue);
    System.out.println(menorQue);
    System.out.println(maiorIgual);
    System.out.println(menorIgual);

    // Operadores Lógicos (retornam true ou false)
    System.out.println("Operadores Lógicos");
    boolean eLogico  = true && false;
    boolean ouLogico = false || true;
    boolean negacao  = !true;

    System.out.println(eLogico);
    System.out.println(ouLogico);
    System.out.println(negacao);

    // Operdaores de Incremento(++) e Decremento(--)
    int valor = 5;
    System.out.println(++valor);
    valor = 5;
    System.out.println(valor++);

    // Operador Ternário
    int maior = (numero1 > numero2) ? numero1 : numero2;
    System.out.println(maior);
  }
}
