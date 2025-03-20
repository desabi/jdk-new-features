package com.desabisc.jdk15.sealedclass.payment;

/**
 * Scenario:
 * We are designing a payment processing system where a Payment class should be extendable only by
 * CreditCardPayment, PayPalPayment, and BankTransferPayment. No other subclass should be allowed.
 */
public sealed abstract class Payment permits CreditCardPayment, PayPalPayment, BankTransferPayment{
  protected double amount;

  public Payment(double amount) {
    this.amount = amount;
  }

  public abstract void processPayment();
}
