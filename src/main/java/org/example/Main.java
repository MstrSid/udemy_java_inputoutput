package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

  public static void main(String[] args) {
    String path = "Folder1";
    File directory = new File(path);
    File file = new File(path + "/names.txt");

    try {
      if (!directory.exists()) {
        directory.mkdirs();
      }
      if (!file.exists()) {
        file.createNewFile();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
      char[] array = new char[1024];
      int count = reader.read(array);
      StringBuilder res = new StringBuilder();
      while (count > 0) {
        res.append(new String(array, 0, count));
        count = reader.read(array);
      }
      System.out.println(res);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}