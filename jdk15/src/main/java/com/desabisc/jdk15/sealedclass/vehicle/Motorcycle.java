package com.desabisc.jdk15.sealedclass.vehicle;

import lombok.extern.slf4j.Slf4j;

// Allowed subclass: Motorcycle
@Slf4j
public final class Motorcycle extends Vehicle {
  private boolean hasSideCar;

  public Motorcycle(String brand, boolean hasSideCar) {
    super(brand);
    this.hasSideCar = hasSideCar;
  }

  @Override
  public void displayInfo() {
    log.info("Motorcycle brand: {}, hasSideCar: {}", brand, hasSideCar);
  }
}
