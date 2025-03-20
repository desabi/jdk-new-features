package com.desabisc.jdk15.sealedclass.employee;

/**
 * Scenario:
 * A company wants to define different types of employees, such as Full-TimeEmployee, Part-TimeEmployee,
 * and Intern, while preventing any other class from extending Employee.
 */
public sealed abstract class Employee permits FullTimeEmployee, PartTimeEmployee, Intern {
  protected String name;
  protected double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public abstract void showDetails();
}
