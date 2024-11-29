import java.util.Arrays;

public class Split {
  public static void main(String[] args) {
    String string = "Nome: Carlos, Idade: 34";
    System.out.println(string);

    String produtos[] = string.split(", ");

    System.out.println(Arrays.toString(produtos));
  
    String nome = produtos[0].split(": ")[1];
    int idade = Integer.parseInt(produtos[1].split(": ")[1]);

    System.out.println(nome);
    System.out.println(idade);
    
  }
}
