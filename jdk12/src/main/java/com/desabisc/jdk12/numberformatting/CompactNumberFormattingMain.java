package com.desabisc.jdk12.numberformatting;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;
import lombok.extern.slf4j.Slf4j;

/**
 * Java 12 introduced the Compact Number Formatting API as part of the java.text.NumberFormat class.
 * This feature allows numbers to be formatted in a more human-readable form (e.g., using "K" for
 * thousands or "M" for millions), which can be very useful in displaying data to users.
 */
@Slf4j
public class CompactNumberFormattingMain {
  public static void main(String[] args) {
    basicEg();
  }

  static void basicEg() {
    log.info("********** basic example **********");
    NumberFormat shortFormat = NumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT);
    log.info("{}", shortFormat.format(1_000)); // Output: 1K
    log.info("{}", shortFormat.format(1_000_000)); // Output: 1M
  }
}
