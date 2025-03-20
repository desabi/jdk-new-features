package com.desabisc.jdk15.sealedclass.employee;

import lombok.extern.slf4j.Slf4j;

// Final subclass: Intern
@Slf4j
public final class Intern extends Employee {

  public Intern(String name, double salary) {
    super(name, salary);
  }

  @Override
  public void showDetails() {
    log.info("Intern: {}, Stipend: ${}", name, salary);
  }
}
