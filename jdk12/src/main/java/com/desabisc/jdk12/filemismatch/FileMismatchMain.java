package com.desabisc.jdk12.filemismatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import lombok.extern.slf4j.Slf4j;

/**
 * Although not strictly a "coding syntax" feature, Java 12 added the Files.mismatch() method,
 * which is very useful in comparing two files. It returns the position of the first byte that
 * differs between two files, or -1 if the files are identical. This simplifies file comparison tasks.
 */
@Slf4j
public class FileMismatchMain {
  public static void main(String[] args) {
    fileMismatchEg();
  }

  /**
   * It returns the position of the first byte that differs between two files,
   * or -1 if the files are identical.
   */
  static void fileMismatchEg() {
    String fileA = "src/main/resources/files/file-a.txt";
    String fileB = "src/main/resources/files/file-b.txt";
    String fileC = "src/main/resources/files/file-c.txt";

    try {
      long mismatch1 = Files.mismatch(Path.of(fileA), Path.of(fileB));
      log.info("mismatch1: {}", mismatch1); // -1: files are identical

      long mismatch2 = Files.mismatch(Path.of(fileB), Path.of(fileC)); // 3: files are different
      log.info("mismatch2: {}", mismatch2);
    } catch (IOException e) {
      log.error("Exception: {}", e.getMessage());
    }
  }
}
