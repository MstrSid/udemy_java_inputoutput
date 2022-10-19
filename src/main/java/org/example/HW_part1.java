package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class HW_part1 {

  public static void main(String[] args) {
    String path = "Folder1/Folder2/Folder3";
    File directory = new File(path);
    List<File> files = new ArrayList<>();
    files.add(new File(path + "/AAA.txt"));
    files.add(new File(path + "/ABC.txt"));
    files.add(new File(path + "/CDA.txt"));
    directory.mkdirs();
    for (File f : files) {
      try {
        f.createNewFile();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    File[] filtered = directory.listFiles((dir, name) -> name.startsWith("A"));
    for (File file : filtered) {
      System.out.println(file.getName());
    }
  }
}
