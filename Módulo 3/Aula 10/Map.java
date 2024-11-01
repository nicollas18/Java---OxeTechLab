import java.util.HashMap;
import java.util.TreeMap;

public class Map {
  public static void main(String[] args) {

    // Ideal para buscar elemento usando uma estrutura chave e valor
    HashMap<Integer, String> idade = new HashMap<>();

    idade.put(33, "Carlos");
    idade.put(44, "Maria");
    idade.put(24, "Júlia");

    System.out.println(idade);

    System.out.println(idade.get(33));

    // Ideal quando a ordem é importante usando uma estrutura de chave e valor
    TreeMap<Integer, String> podio = new TreeMap<>();

    podio.put(1, "João");
    podio.put(2, "Clara");
    podio.put(3, "Beto");

    System.out.println(podio);

    System.out.println(podio.get(1));
  }
}
