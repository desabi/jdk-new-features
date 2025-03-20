package com.desabisc.jdk15.sealedclass.vehicle;

/**
 * Key Benefits:
 * Prevents unintended subclassing – No other class can extend Vehicle except Car and Motorcycle.
 * Improves maintainability – Ensures that only a specific, well-defined set of classes extends Vehicle.
 * Enhances security – Avoids subclassing from unauthorized or external sources.
 */
public class VehicleMain {
  public static void main(String[] args) {
    Vehicle myCar = new Car("Toyota", 4);
    Vehicle myBike = new Motorcycle("Harley-Davidson", false);

    myCar.displayInfo();
    myBike.displayInfo();
  }
}
