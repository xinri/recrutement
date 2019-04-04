package com.craft.o;

public class Autruche extends Bird {

  public Autruche() {
    super("Autruche");
  }

  @Override
  public void fly() {
    throw new IllegalStateException("ne peut pas voler");
  }
}
