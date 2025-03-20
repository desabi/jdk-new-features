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
    //basicEg();
    //webVisitorCount();
    //handlingDifferentLocales();
    //stockMarket();
    //followersCount();
    //productPrices();
    accountBalances();
  }

  static void basicEg() {
    log.info("********** basic example **********");
    NumberFormat shortFormat = NumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT);
    log.info("{}", shortFormat.format(1_000)); // Output: 1K
    log.info("{}", shortFormat.format(1_000_000)); // Output: 1M
  }

  /**
   * Scenario: Displaying Website Visitor Count
   * Imagine a website tracking visitor statistics. Instead of displaying large numbers like 1000000,
   * you can use Compact Number Formatting to show 1M.
   * SHORT style: Uses symbols like K (thousand), M (million), B (billion).
   * LONG style: Uses words like thousand, million, billion.
   */
  static void webVisitorCount() {
    log.info("########## Web Visitor Count ##########");
    NumberFormat shortFormat = NumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT);
    NumberFormat longFormat = NumberFormat.getCompactNumberInstance(Locale.US, Style.LONG);

    int visitors = 1_000_000;

    log.info("Short format: {}", shortFormat.format(visitors)); // Output: 1M
    log.info("Long format: {}", longFormat.format(visitors)); // Output: 1 million
  }

  /**
   * Handling Different Locales
   * Compact Number Formatting adapts based on the locale. Let’s see how it works with different countries.
   */
  static void handlingDifferentLocales() {
    log.info("########## Handling Different Locales ##########");
    int value = 1_500_000;

    NumberFormat usFormat = NumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT);
    NumberFormat frFormat = NumberFormat.getCompactNumberInstance(Locale.FRANCE, Style.SHORT);
    NumberFormat jpFormat = NumberFormat.getCompactNumberInstance(Locale.JAPAN, Style.SHORT);

    // round the numbers
    log.info("US Format: {}", usFormat.format(value)); // Output: 1.5M
    log.info("France Format: {}", frFormat.format(value)); // Output: 1,5 M
    System.out.println("France Format: " + frFormat.format(value));
    log.info("Japan Format: {}", jpFormat.format(value)); // Output: 150万 (1.5 million in Kanji)
  }

  /**
   * Scenario:
   * A stock market application displays company market capitalization.
   * Instead of showing huge numbers, we use compact formatting for clarity.
   * Better readability for large numbers in stock market applications.
   * Removes unnecessary zeros while still conveying the scale.
   */
  static void stockMarket() {
    log.info("########## Stock Market ##########");
    NumberFormat format = NumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT);

    long appleMarketCap = 2_850_000_000_000L; // $2.85 Trillion
    long teslaMarketCap = 950_000_000_000L; // $950 Billion
    long amazonMarketCap = 1_700_000_000_000L; // $1.7 Trillion

    // round the numbers
    log.info("Apple: $ {}", format.format(appleMarketCap));  // Output: Apple: $2.85T
    log.info("Tesla: $ {}", format.format(teslaMarketCap));  // Output: Tesla: $950B
    log.info("Amazon: $ {}", format.format(amazonMarketCap)); // Output: Amazon: $1.7T
  }

  /**
   * Scenario:
   * A social media app wants to display follower counts in a compact form.
   * Compact and readable follower counts.
   * Easier for users to understand scale at a glance.
   */
  static void followersCount() {
    log.info("########## Followers Count ##########");
    NumberFormat format = NumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT);

    int twitterFollowers = 125_000;
    int instagramFollowers = 2_500_000;
    int youtubeSubscribers = 75_000_000;

    log.info("Twitter Followers: {}", format.format(twitterFollowers));  // Output: Twitter Followers: 125K
    log.info("Instagram Followers: {}", format.format(instagramFollowers));  // Output: Instagram Followers: 2.5M
    log.info("YouTube Subscribers: {}", format.format(youtubeSubscribers));  // Output: YouTube Subscribers: 75M
  }

  /**
   * Scenario:
   * An e-commerce site wants to show discounted price comparisons more neatly.
   * Helps display price comparisons in a concise way.
   * Reduces visual clutter on product pages.
   */
  static void productPrices() {
    log.info("########## Product Prices ##########");
    NumberFormat format = NumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT);

    int originalPrice = 500_000;
    int discountedPrice = 350_000;

    log.info("Original Price: $ {}", format.format(originalPrice));  // Output: Original Price: $500K
    log.info("Discounted Price: $ {}", format.format(discountedPrice));  // Output: Discounted Price: $350K
  }

  /**
   * Scenario:
   * A banking app wants to format bank balances and loan amounts.
   * Makes large numbers more user-friendly.
   * Helps users understand finances at a glance.
   */
  static void accountBalances() {
    log.info("########## Account Balances ##########");
    NumberFormat format = NumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT);

    long savingsBalance = 125_000_000;
    long homeLoan = 3_250_000;
    long creditCardDebt = 45_000;

    // it round the numbers
    log.info("Savings Balance: ${}", format.format(savingsBalance));  // Output: Savings Balance: $125M
    log.info("Home Loan: ${}", format.format(homeLoan));  // Output: Home Loan: $3.25M
    log.info("Credit Card Debt: ${}", format.format(creditCardDebt));  // Output: Credit Card Debt: $45K
  }
}
