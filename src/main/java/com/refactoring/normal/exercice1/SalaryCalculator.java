package com.refactoring.normal.exercice1;

import java.util.Optional;

public class SalaryCalculator {

  public static void main(String[] args) {
    Employee martin = new Employee(500d);
    Employee francois = new Employee(100d);
    Manager ken = new Manager(500d, 100d);

    System.out.println("total salary : " + (
        martin.getTotalSalary() + francois.getTotalSalary() + ken.getTotalSalary()));
  }
}

class Employee {

  private double totalSalary;

  Employee(double salary) {
    this.totalSalary = salary +
        (getStockOption().isPresent() ? getStockOption().get() : 0d);
  }

  public Optional<Double> getStockOption() {
    return Optional.empty();
  }

  public double getTotalSalary() {
    return totalSalary;
  }
}

class Manager extends Employee {

  private Double stockOption;

  Manager(double salary, double stockOption) {
    super(salary);
    this.stockOption = stockOption;
  }

  @Override
  public Optional<Double> getStockOption() {
    return Optional.of(stockOption);
  }
}
