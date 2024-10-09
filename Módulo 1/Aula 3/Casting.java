public class Casting {
  public static void main(String[] args) {
    // Conversão Explícita
    // Essa conversão ocorre de forma manual, geralemnte acontece quando convertemos de um tipo de dado maior para um tipo menor (por exemplo, de um int para um byte).

    byte tipoByte = 12;         // -128 a 127
    short tipoShort = 123;      // -32.768 a 32.767
    int tipoInt = 1234;         // -2.147.483.648 a  2.147.483.647
    long tipoLong = 12345;      // -9.223.372.036.854.775.808 a 9.223.372.036.854.775.808
    

    tipoInt   = (int) tipoLong;
    tipoShort = (short) tipoInt;
    tipoByte  = (byte) tipoShort;

    System.out.println(tipoInt);
    System.out.println(tipoShort);
    System.out.println(tipoByte);

    float tipoFloat = 75.56F;        // -1.40239846e-45f a 3.40282347e+38f
    double tipoDouble = 756.65;      // 4.94065645841246544e-324 a 1.79769313486231570e+308

    tipoFloat = (float) tipoDouble;

    System.out.println(tipoFloat);
    
  }
}
