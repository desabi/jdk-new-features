package com.desabisc.jdk15.sealedclass.payment;

import lombok.extern.slf4j.Slf4j;

// Final subclass: Credit Card Payment
@Slf4j
public final class CreditCardPayment extends Payment {
  private String cardNumber;

  public CreditCardPayment(double amount, String cardNumber) {
    super(amount);
    this.cardNumber = cardNumber;
  }

  @Override
  public void processPayment() {
    log.info("Processing credit card payment of ${} using card {}", amount, cardNumber);
  }
}
