package org.example;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {

  public static void main(String[] args) {
    String path = "Folder1";
    File directory = new File(path);
    File file = new File(path + "/names.txt");

//    try(OutputStream outputStream = new FileOutputStream(file, true)) {
//      String names = "Mike Ann Bob Kyle Leo Sonya Alex Adam\n";
//      outputStream.write(names.getBytes());
//    } catch (Exception e){
//      e.printStackTrace();
//    }

    try (InputStream in = new BufferedInputStream(new FileInputStream(file))) {
      long before = System.currentTimeMillis();
      int a = in.read();
      StringBuilder res = new StringBuilder();
      while (a != -1) {
        res.append((char) a);
        a = in.read();
      }
      long after = System.currentTimeMillis();
      System.out.println(after - before);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}