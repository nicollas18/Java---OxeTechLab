public class Estatico {

    public static void main(String[] args) {
        Estatico.estatico();

        // Criando um objeto da classe Estatico
        Estatico novoEstativo = new Estatico();
        novoEstativo.naoEstatico();
    }

    // Esse método pode ser chamado sem precisar criar um objeto
    public static void estatico() {
        System.out.println("Estático");
    }

    // Para chamar esse método é preciso criar um objeto
    public void naoEstatico() {
        System.out.println("Não Estático");
    }
}
