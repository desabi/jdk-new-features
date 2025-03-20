package com.desabisc.jdk15.sealedclass.payment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
// Final subclass: PayPal Payment
public final class PayPalPayment extends Payment {
  private String email;

  public PayPalPayment(double amount, String email) {
    super(amount);
    this.email = email;
  }

  @Override
  public void processPayment() {
    log.info("Processing PayPal payment of ${} for email {}", amount, email);
  }
}
