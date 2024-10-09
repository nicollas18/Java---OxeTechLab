public class Convercoes {
  public static void main(String[] args) {
    // Conversão Implícita
    // Essa conversão ocorre de forma automática, geralemnte acontece quando convertemos de um tipo de dado menor para um tipo maior (por exemplo, de um byte para um int).

         
    long tipoLong = 12345L;      // -9.223.372.036.854.775.808 a 9.223.372.036.854.775.808
    int tipoInt = 1234;         // -2.147.483.648 a  2.147.483.647
    short tipoShort = 123;      // -32.768 a 32.767
    byte tipoByte = 12;         // -128 a 127

    tipoShort = tipoByte; 
    tipoInt   = tipoShort;
    tipoLong  = tipoInt;

    System.out.println(tipoShort);
    System.out.println(tipoInt);
    System.out.println(tipoLong);

    double tipoDouble = 756.65;      // 4.94065645841246544e-324 a 1.79769313486231570e+308
    float tipoFloat = 75.56F;        // -1.40239846e-45f a 3.40282347e+38f
    
    tipoDouble = tipoFloat;

    System.out.println(tipoDouble);

  }
}