import java.util.HashSet;
import java.util.TreeSet;

public class Set {
  public static void main(String[] args) {

    // Ideal paara buscar elementos
    HashSet<Integer> tabela = new HashSet<>();

    tabela.add(60);
    tabela.add(50);
    tabela.add(30);
    tabela.add(60);

    System.out.println(tabela);

    System.out.println(tabela.contains(50));

    // Ideal para manter a ordem dos elementos
    TreeSet<Integer> arvore = new TreeSet<>();

    arvore.add(50);
    arvore.add(30);
    arvore.add(60);

    System.out.println(arvore);


  }
}
