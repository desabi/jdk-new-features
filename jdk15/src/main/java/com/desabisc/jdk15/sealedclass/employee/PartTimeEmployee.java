package com.desabisc.jdk15.sealedclass.employee;

import com.desabisc.jdk15.sealedclass.payment.Payment;
import lombok.extern.slf4j.Slf4j;

// Final subclass: Part-Time Employee
@Slf4j
public final class PartTimeEmployee extends Employee {

  public PartTimeEmployee(String name, double salary) {
      super(name, salary);
  }

  @Override
  public void showDetails() {
    log.info("Part-Time Employee: {}, Salary: ${}", name, salary);
  }

}
