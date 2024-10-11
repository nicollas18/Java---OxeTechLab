public class Metodos {
    // Modificadores de acesso: public, protected, private
    // Um método pode ser estático ou não estático
    // Tipos de retorno: byte, short, int, long, float, double, char, boolean, String
    // Nome do método: segue as mesmas regras para nomear variáveis
    // Parâmetros: dados que são passados para o método, como um nome, uma idade por exemplo
    // retorno: depende do tipo de retorno declarado na assinatura do método

    public static void main(String[] args) {
        String nome = "Gabriel";
        int pontosTotal, pontosPartida = 75, nivel = 11;
        String status = "Sem Status";

        menssagemPersonalizada(nome);

        pontosTotal = calcularPontos(pontosPartida, nivel);
        System.out.println("Você tem " + pontosTotal + " pontos");

        status = atualizarStatus(nivel);
        System.out.println(status);
    }

    public static void menssagemPersonalizada(String nomeUsuario) {
        System.out.println("Olá, " + nomeUsuario + ", seja bem-vindo(a)!");
    }

    public static int calcularPontos(int pontos, int nivel) {
        int resultado = (pontos + nivel) * 2;
        return  resultado;
    }

    public static String atualizarStatus(int nivel) {
        String novoStatus = (nivel > 10) ? "Novato" : "Sem Status";
        return novoStatus;
    }


}


