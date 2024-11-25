package models;

public class Carro {
  String marca;
  String modelo;
  int ano;

  public void acelar() {
    System.out.println("O carro está acelerando.");
  }

  public void frear() {
    System.out.println("O carro está freaando.");
  }
}
