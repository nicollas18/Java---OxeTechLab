public class DecisaoElse {
  public static void main(String[] args) {
    // O else permite criar um alternativa caso a condição do if seja falsa, não sendo necessário criar várias if, por exemplo.
    // Para usar um else é preciso ter um if, ou seja, não existem else sem if, mas existem if sem else.
    String nomeUsuario = "Charles";
    int itens = 455;
    double precoItem = 0.67, dinheiro = 34.56, sobrou, faltou;

    double totalPagar = itens * precoItem;

    if (totalPagar <= dinheiro) {
      sobrou =  dinheiro - totalPagar;
      System.out.println(nomeUsuario +", você poder comprar os itens e sobrou R$" + sobrou);

    } else {
      faltou = totalPagar - dinheiro;
      System.out.println(nomeUsuario + ", você não pode comprar os itens, pois faltou R$" + faltou);
    }
  }
}
