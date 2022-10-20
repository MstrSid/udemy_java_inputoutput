package org.example;

import java.io.File;
import java.io.RandomAccessFile;

public class Main {

  public static void main(String[] args) {
    String path = "Folder1";
    File directory = new File(path);
    File file = new File(path + "/names.txt");
    try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
      randomAccessFile.seek(1000);
      byte[] array = new byte[1024];
      randomAccessFile.read(array);
      System.out.println(new String(array));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}