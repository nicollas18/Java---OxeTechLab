public class Sobrecarga {
    // A sobrecarga de método permite criar métodos com o mesmo nome, porém com parâmetros diferentes
    public static void main(String[] args) {
        String nome = "Carlos";
        int numeroConta = 234;
        String tipoConta = "Conta Corrente";
        exibirPerfil(nome);
        exibirPerfil(nome, numeroConta);
        exibirPerfil(nome, numeroConta, tipoConta);
    }

    public static void exibirPerfil(String nomeCliente) {
        System.out.println(nomeCliente);
    }

    public static void exibirPerfil(String nomeCliente, int numeroConta) {
        System.out.println(nomeCliente);
        System.out.println(numeroConta);
    }

    public static void exibirPerfil(String nomeCliente, int numeroConta, String tipoConta) {
        System.out.println(nomeCliente);
        System.out.println(numeroConta);
        System.out.println(tipoConta);
    }
}
