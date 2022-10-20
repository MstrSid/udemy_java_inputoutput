package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
//    File file = new File("user.txt");
//    try {
//      file.createNewFile();
//    } catch (IOException e) {
//      throw new RuntimeException(e);
//    }
//    User user1 = new User("Mike", "Terrana", 25, new Address("Minskaya", 103));
//    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
//      outputStream.writeObject(user1);
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
//
//    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
//      User u = (User) inputStream.readObject();
//      System.out.println(u);
//    } catch (Exception e) {
//      e.printStackTrace();
//    }

    List<Cat> cats = new ArrayList<>();
    cats.add(new Cat("Bob", "persian", 5.5));
    cats.add(new Cat("Meowing", "british", 4.8));
    cats.add(new Cat("Puffy", "bobtail", 5.0));
    File file = new File("cats.txt");

    try {
      file.createNewFile();
    } catch (Exception e) {
      e.printStackTrace();
    }

    try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
        new FileOutputStream(file))) {
      objectOutputStream.writeObject(cats);
    } catch (Exception e) {
      e.printStackTrace();
    }

    try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
      List<Cat> restoredCats = (List<Cat>) objectInputStream.readObject();
      for (Cat cat : restoredCats) {
        System.out.println(cat.getName());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}