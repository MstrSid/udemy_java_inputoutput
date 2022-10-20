package org.example;

import java.io.Serializable;

public class User extends Person {

  private int age;

  private Address address;

  public User(String name, String lastName, int age, Address address) {
    super(name, lastName);
    this.age = age;
    this.address = address;
  }


  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "User{ " +
        super.toString()+
        ", age=" + age +
        ", address=" + address +
        '}';
  }
}
