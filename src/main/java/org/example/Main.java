package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {

  public static void main(String[] args) {

    File file = new File("1.txt");

    try (InputStream in = new FileInputStream(file)) {
      if (!file.exists()) {
        file.createNewFile();
      }
      int a = in.read();
      while (a != -1) {
        System.out.print((char) a);
        a = in.read();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}