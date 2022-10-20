package org.example;

import java.io.Serializable;

public class Address implements Serializable {
  private String streetName;
  private int houseNumber;

  public Address(String streetName, int houseNumber) {
    this.streetName = streetName;
    this.houseNumber = houseNumber;
  }

  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public int getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(int houseNumber) {
    this.houseNumber = houseNumber;
  }

  @Override
  public String toString() {
    return "Address{" +
        "streetName='" + streetName + '\'' +
        ", houseNumber=" + houseNumber +
        '}';
  }
}
