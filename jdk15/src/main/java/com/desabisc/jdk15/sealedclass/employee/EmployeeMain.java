package com.desabisc.jdk15.sealedclass.employee;

/**
 * Key Benefits:
 * Restricts inheritance – Prevents creation of unintended employee types.
 * Better security – Ensures only company-approved employee categories exist.
 * Enhanced maintainability – Developers can quickly understand allowed employee types.
 */
public class EmployeeMain {
  public static void main(String[] args) {
    Employee fullTime = new FullTimeEmployee("Alice", 60_000);
    Employee partTime = new PartTimeEmployee("Bob", 30_000);
    Employee intern = new Intern("Charlie", 15_000);

    fullTime.showDetails();
    partTime.showDetails();
    intern.showDetails();
  }
}
