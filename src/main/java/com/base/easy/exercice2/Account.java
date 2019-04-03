package com.base.easy.exercice2;

public class Account {

  private final String name;
  private final String category;
  private final double amount;

  public Account(String name, String category, double amount) {
    this.name = name;
    this.category = category;
    this.amount = amount;
  }

  public String getName() {
    return name;
  }

  public String getCategory() {
    return category;
  }

  public double getAmount() {
    return amount;
  }
}
