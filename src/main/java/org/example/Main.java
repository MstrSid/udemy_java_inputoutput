package org.example;

import java.io.File;

public class Main {

  public static void main(String[] args) {
    File directory = new File("folder/folder2/folder1");
    File file1 = new File("folder/folder2/folder1/file1.txt");
    File file2 = new File("folder/folder2/folder1/file2.txt");
    File file3 = new File("folder/folder2/folder1/file3.txt");
    try {
      directory.mkdirs();
      file1.createNewFile();
      file2.createNewFile();
      file3.createNewFile();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("Directory: ");
    System.out.println("is exists: " + directory.exists());
    System.out.println("is directory: " + directory.isDirectory());
    System.out.println("is file: " + directory.isFile());
    System.out.println("----------------------");
    System.out.println("File1: ");
    System.out.println("is exists: " + file1.exists());
    System.out.println("is directory: " + file1.isDirectory());
    System.out.println("is file: " + file1.isFile());
    System.out.println("----------------------");
    System.out.println("File2: ");
    System.out.println("is exists: " + file2.exists());
    System.out.println("is directory: " + file2.isDirectory());
    System.out.println("is file: " + file2.isFile());
    System.out.println("----------------------");
    System.out.println("File3: ");
    System.out.println("is exists: " + file3.exists());
    System.out.println("is directory: " + file3.isDirectory());
    System.out.println("is file: " + file3.isFile());
    System.out.println("----------------------");

    File[] files = directory.listFiles((dir, name) -> name.contains("1") || name.contains("2"));
    for (File f : files) {
      System.out.println(f.getName());
    }
  }
}