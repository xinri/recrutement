package com.craft.o;

public class Bird {

  private String name;

  public Bird(String name) {
    this.name = name;
  }

  public void layEggs() {
    System.out.println("eggs");
  }

  public void fly() {
    System.out.println("flap flap");
  }
}
