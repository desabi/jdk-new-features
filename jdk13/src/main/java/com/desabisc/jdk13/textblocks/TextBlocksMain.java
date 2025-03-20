package com.desabisc.jdk13.textblocks;

import lombok.extern.slf4j.Slf4j;

/**
 * Text Blocks allow developers to write multi-line string literals in a clean and readable way
 * without needing to escape special characters like double quotes or newlines.
 * This feature helps with working with JSON, XML, SQL queries, or HTML.
 *  Uses triple quotes (""") to define a text block.
 * This reduces the need for excessive string concatenation and makes code easier to read.
 */
@Slf4j
public class TextBlocksMain {

  public static void main(String[] args) {
    //basicEgA();
    //sqlQuery();
    //htmlEg();
    //logging();
    //emailTemplate();
    configurationData();
  }

  static void basicEgA() {
    log.info("########## basic eg ##########");
    String html = """
              <html>
                  <body>
                      <p>Hello, World</p>
                  </body>
              </html>
              """;

    String json = """
             {
                 "name": "John",
                 "age": 30,
                 "city": "New York"
             }
             """;

    log.info("\n{}", html);
    log.info("\n{}", json);
  }

  static void sqlQuery() {
    log.info("########## SQL Query ##########");
    // Before Java 13 (Without Text Blocks)
    String sqlQuery1 = "SELECT id, name, email FROM users " +
        "WHERE status = 'ACTIVE' " +
        "ORDER BY name ASC";

    // With Java 13 Text Blocks
    String sqlQuery2 = """
        SELECT id, name, email 
        FROM users 
        WHERE status = 'ACTIVE' 
        ORDER BY name ASC
        """;

    log.info("\n{}", sqlQuery1);
    log.info("\n{}", sqlQuery2);
  }

  static void htmlEg() {
    log.info("########## HTML ##########");

    // Before Java 13 (Without Text Blocks)
    String html1 = "<html>\n" +
        "    <body>\n" +
        "        <h1>Welcome</h1>\n" +
        "        <p>Hello, World!</p>\n" +
        "    </body>\n" +
        "</html>";

    // With Java 13 Text Blocks
    String html2 = """
        <html>
            <body>
                <h1>Welcome</h1>
                <p>Hello, World!</p>
            </body>
        </html>
        """;

    log.info("\n{}", html1);
    log.info("\n{}", html2);
  }

  static void logging() {
    log.info("########## Logging Messages ##########");

    // Before Java 13 (Without Text Blocks)
    String logMessage1 = "ERROR: Application failed to start\n" +
        "Reason: Database connection refused\n" +
        "Timestamp: " + System.currentTimeMillis();

    // With Java 13 Text Blocks
    String logMessage2 = """
        ERROR: Application failed to start
        Reason: Database connection refused
        Timestamp: %d
        """.formatted(System.currentTimeMillis());

    log.info("\n{}", logMessage1);
    log.info("\n{}", logMessage2);
  }

  static void emailTemplate() {
    log.info("########## Email Template ##########");

    String emailTemplate1 = "Dear Customer,\n\n" +
        "Thank you for your purchase.\n" +
        "Your order has been successfully placed.\n\n" +
        "Best regards,\nE-Shop Team";

    String emailTemplate2 = """
        Dear Customer,
        
        Thank you for your purchase.
        Your order has been successfully placed.
        
        Best regards,
        E-Shop Team
        """;

    log.info("\n{}", emailTemplate1);
    log.info("\n{}", emailTemplate2);
  }

  static void configurationData() {
    log.info("########## Configuration Data ##########");

    String config1 = "server.port=8080\n" +
        "server.host=localhost\n" +
        "database.url=jdbc:mysql://localhost:3306/mydb";

    String config2 = """
        server.port=8080
        server.host=localhost
        database.url=jdbc:mysql://localhost:3306/mydb
        """;

    log.info("\n{}", config1);
    log.info("\n{}", config2);
  }
}
