package com.desabisc.jdk15.sealedclass.vehicle;

/**
 * Scenario:
 * Suppose we have a Vehicle class that should only be extended by specific types like Car and Motorcycle.
 * By using sealed classes, we prevent unwanted subclassing, ensuring that only approved types can extend Vehicle.
 */
public sealed abstract class Vehicle permits Car, Motorcycle {
  protected String brand;

  public Vehicle(String brand) {
    this.brand = brand;
  }

  public abstract void displayInfo();
}
