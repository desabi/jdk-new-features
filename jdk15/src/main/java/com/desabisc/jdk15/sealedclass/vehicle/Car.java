package com.desabisc.jdk15.sealedclass.vehicle;

import lombok.extern.slf4j.Slf4j;

// Allowed subclass: Car
@Slf4j
public final class Car extends Vehicle {
  private int doors;

  public Car(String brand, int doors) {
    super(brand);
    this.doors = doors;
  }

  @Override
  public void displayInfo() {
    log.info("Car brand: {}, Doors: {}", brand, doors);
  }
}
