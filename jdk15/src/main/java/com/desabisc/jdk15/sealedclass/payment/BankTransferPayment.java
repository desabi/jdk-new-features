package com.desabisc.jdk15.sealedclass.payment;

import lombok.extern.slf4j.Slf4j;

// Final subclass: Bank Transfer Payment
@Slf4j
public final class BankTransferPayment extends Payment {
  private String bankAccount;

  public BankTransferPayment(double amount, String bankAccount) {
    super(amount);
    this.bankAccount = bankAccount;
  }

  @Override
  public void processPayment() {
    log.info("Processing bank transfer payment of ${} to account {}", amount, bankAccount);
  }
}
