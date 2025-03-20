package com.desabisc.jdk15.sealedclass.employee;

import lombok.extern.slf4j.Slf4j;

// Final subclass: Full-Time Employee
@Slf4j
public final class FullTimeEmployee extends Employee {

  public FullTimeEmployee(String name, double salary) {
    super(name, salary);
  }

  @Override
  public void showDetails() {
    log.info("Full-Time Employee: {}, Salary: ${}", name, salary);
  }
}
