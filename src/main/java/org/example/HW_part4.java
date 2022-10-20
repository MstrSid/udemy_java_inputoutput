package org.example;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.util.Scanner;

public class HW_part4 {

  public static void main(String[] args) {
    String path = "Folder1";
    File file = new File(path + "/names.txt");
    Scanner sc = new Scanner(System.in);
    String answer;
    try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
      while (true) {
        System.out.println("Enter the name or enter \"exit\"");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("EXIT")) {
          break;
        }
        outputStream.write((answer + "\n").getBytes());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    try (Reader inputStream = new InputStreamReader(new FileInputStream(file))) {
      char[] array = new char[1024];
      int count = inputStream.read(array);
      StringBuilder res = new StringBuilder();
      while (count > 0) {
        res.append(new String(array, 0, count));
        count = inputStream.read(array);
      }
      System.out.println(res);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
