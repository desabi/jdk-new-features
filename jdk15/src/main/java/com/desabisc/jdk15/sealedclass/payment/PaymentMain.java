package com.desabisc.jdk15.sealedclass.payment;

/**
 * Key Benefits:
 * Restricts subclassing – Ensures only valid payment methods (CreditCardPayment, PayPalPayment, BankTransferPayment) are implemented.
 * Improves security – No unauthorized subclass can modify or misuse the Payment hierarchy.
 * Better code maintainability – Only predefined payment types can be used, reducing the risk of unintended behavior.
 */
public class PaymentMain {
  public static void main(String[] args) {
    Payment creditCard = new CreditCardPayment(100.0, "1234-5678-9012-3456");
    Payment paypal = new PayPalPayment(50.0, "user@example.com");
    Payment bankTransfer = new BankTransferPayment(200.0, "987654321");

    creditCard.processPayment(); // Output: Processing credit card payment of $100.0 using card 1234-5678-9012-3456
    paypal.processPayment(); // Output: Processing PayPal payment of $50.0 for email user@example.com
    bankTransfer.processPayment(); // Output: Processing bank transfer payment of $200.0 to account 987654321
  }
}
