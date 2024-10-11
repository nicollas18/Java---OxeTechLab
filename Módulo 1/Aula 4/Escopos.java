public class Escopos {
    // Escopo Local: vairáveis declaradas dentro de métodos
    // Escopo Global: variáveis declaradas dentro de classes
     static int numero1 = 10;

    public static void main(String[] args) {
        int numero = 20;
        System.out.println(numero);
    }

    public static void outroMetodo() {
        //System.out.println(numero); //  a variável numero não é visível para outros métodos
        System.out.println(numero1);  // a varíavel nuermo1 é visível para todos os métodos dentro da classe
    }
}
