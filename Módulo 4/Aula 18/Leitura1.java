import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Leitura1 {
  public static void main(String[] args) {
    // Leitura de Arquivos
    ArrayList<String> nomes = new ArrayList<>();
    
    try (BufferedReader leitor = new BufferedReader(new FileReader("files/nomes.txt"))) {

      String linha = leitor.readLine();

      while (linha != null) {
        nomes.add(linha);
        linha = leitor.readLine();
      }

    } catch(Exception erro) {
      System.out.println(erro);
    }

    for (String nome : nomes) {
      System.out.println(nome);
    }
  }
}
