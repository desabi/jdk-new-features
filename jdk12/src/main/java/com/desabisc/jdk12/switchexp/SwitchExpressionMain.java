package com.desabisc.jdk12.switchexp;

import lombok.extern.slf4j.Slf4j;

/**
 * This feature enhances the switch statement to allow it to be used as an expression,
 * which can return a value. It also introduces a new, more concise syntax.
 * This simplifies the code and reduces the boilerplate, making it easier to write and read.
 * It also helps to avoid common errors like missing break statements
 */
@Slf4j
public class SwitchExpressionMain {
  public static void main(String[] args) {
    switchExpressionEg(4);
    switchExpressionEg(7);
    discounts("GOLD");
    handleNull(null);
    multipleStatements("REFUND");
    groupingSeasons("July");
  }

  /**
   * No need for explicit break statements.
   * Simpler, cleaner code when dealing with multiple case labels.
   * The switch expression can return a value directly.
   * Arrow (->) syntax replaces the traditional case ... : block.
   *
   * @param day the given day.
   */
  static void switchExpressionEg(int day) {
    log.info("********** basic example **********");
    String dayType = switch (day) {
      case 1, 2, 3, 4, 5 -> "Weekday";
      case 6, 7 -> "Weekend";
      default -> "Invalid day";
    };

    log.info("Day Type: {}", dayType);
  }

  static void discounts(String membershipType) {
    log.info("********** handle default with exception **********");
    double discount = switch (membershipType) {
      case "BRONZE" -> 0.05;
      case "SILVER" -> 0.10;
      case "GOLD" -> 0.15;
      case "PLATINUM" -> 0.20;
      default -> throw new IllegalArgumentException("Invalid membership type");
    };

    log.info("Discount: {}%", (discount*100)); // Output: Discount: 15.0%
  }

  static void handleNull(String orderStatus) {
    log.info("********** handle null **********");
    String result = switch(orderStatus) {
      case "PROCESSING" -> "Order is being processed.";
      case "SHIPPED" -> "Order has been shipped.";
      case "DELIVERED" -> "Order has delivered.";
      case null -> "Order status is unknown";
      default -> "Invalid order status";
    };
    log.info("result: {}", result); // Output: Order status is unknown.
  }

  /**
   * You can run multiple lines of code within each case.
   * yield is used to return a value from multi-line case blocks. This is necessary when using
   * block-style syntax within the switch expression.
   *
   * @param transactionType the value.
   */
  static void multipleStatements(String transactionType) {
    log.info("********** multiple statements **********");
    double fee = switch (transactionType) {
      case "PURCHASE" -> {
        log.info("Processing purchase...");
        yield 0.02; // 2% fee
      }
      case "REFUND" -> {
        log.info("Processing refund...");
        yield 0.00; // No fee for refunds
      }
      case "WITHDRAWAL" -> {
        log.info("Processing withdrawal...");
        yield 0.01; // 1% fee
      }
      default -> {
        log.info("Unknown transaction type...");
        yield 0.05; // Default 5% fee
      }
    };

    log.info("Transaction fee: {}%", (fee*100));
  }

  static void groupingSeasons(String month) {
    log.info("********** basic example 2 **********");
    String season = switch (month) {
      case "December", "January", "February" -> "Winter";
      case "March", "April", "May" -> "Spring";
      case "June", "July", "August" -> "Summer";
      case "September", "October", "November" -> "Fall";
      default -> "Unknown month";
    };

    log.info("Season: {}", season);
  }

}
