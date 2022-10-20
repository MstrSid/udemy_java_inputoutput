package org.example;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class HW_part5 {

  public static void main(String[] args) {
    String path = "Folder1";
    File directory = new File(path);
    File file = new File(path + "/names.txt");
    try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r")) {
      Scanner sc = new Scanner(System.in);
      byte[] pageText = new byte[3000];
      System.out.println("Enter page number or \"stop\" for exit");
      String input = sc.nextLine();
      while (!input.toLowerCase().equals("stop")) {
        int page = Integer.parseInt(input);
        randomAccessFile.seek((long) (page - 1) * pageText.length);
        randomAccessFile.read(pageText);
        System.out.println(new String(pageText));
        System.out.println("Enter page number or \"stop\" for exit");
        input = sc.nextLine();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
