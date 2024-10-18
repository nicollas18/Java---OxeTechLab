public class LoopDoWhile {
    public static void main(String[] args) {
        // O loop do-while também permite executar um bloco de código enquanto uma condição for verdadeira
        // Porém esse loop sempre garante que ao menos uma iteração será executada

        int i = 0;

        do {
            System.out.println(i);
            i++;
        } while (i < 5);
    }

    // Caso o valor de i fosse inicializado com 5 o loop ia executar ao menos uma vez, o que não aconteceria no caso de um loop while

}
