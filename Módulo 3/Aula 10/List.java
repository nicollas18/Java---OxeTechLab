import java.util.ArrayList;
import java.util.LinkedList;

public class List {
  public static void main(String[] args) {

    // Ideal para acessa informações
    ArrayList<Integer> numeros = new ArrayList<>();
    numeros.add(5);
    numeros.add(3);
    numeros.add(7);
    System.out.println(numeros);

    numeros.remove(1);

    System.out.println(numeros);


    // Ideal para fazer inserções e remoções
    LinkedList<Integer> lista = new LinkedList<>();

    lista.add(3);
    lista.addLast(5);
    lista.addFirst(7);
    lista.peekFirst();
    

    System.out.println(lista);

    System.out.println(lista.get(2));

  }
}
