package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class HW_part2 {

  public static void main(String[] args) {
    String path = "Folder1";
    File directory = new File(path);
    File file1 = new File(path + "/file1.txt");
    try {
      if (directory.exists()) {
        if (file1.exists()) {
          try (InputStream in = new FileInputStream(file1)) {
            int a = in.read();
            while (a != -1) {
              System.out.print((char) a);
              a = in.read();
            }
          } catch (Exception e) {
            e.printStackTrace();
          }
        } else {
          file1.createNewFile();
        }
      } else {
        directory.mkdirs();
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }
}
