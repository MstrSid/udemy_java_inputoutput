package org.example;

import java.io.Serializable;

public class Person implements Serializable {
  private String name;
  private String lastName;

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", lastName='" + lastName + '\'' +
        '}';
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person(String name, String lastName) {
    this.name = name;
    this.lastName = lastName;
  }
}
