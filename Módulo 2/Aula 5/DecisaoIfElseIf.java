public class DecisaoIfElseIf {
  public static void main(String[] args) {
   // O if-else-if é uma forma de verificar múltiplas condições.

   String nomeAluno = "Júlio";
   double nota = 7.5;

   // 7-10: aprovado
   // 4-6 : recuperação
   // 1-3 : reprovado

   if (nota >= 7.0 && nota <= 10.0) {
    System.out.println(nomeAluno + ", você está Aprovado!");

   } else if (nota >= 4.0 && nota <= 6.0) {
    System.out.println(nomeAluno + ", voce está em Recuperação.");

   } else {
    System.out.println(nomeAluno + ", você está Reprovado.");
   }

  }
}
