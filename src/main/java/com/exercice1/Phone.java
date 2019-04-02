package com.exercice1;

public class Phone {

  private String phoneName;
  private String phoneNumber;

  public Phone(String phoneName) {
    this(phoneName, "");
  }

  public Phone(String phoneName, String phoneNumber) {
    this.phoneName = phoneName;
    this.phoneNumber = phoneNumber;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  private String getPhoneName() {
    return phoneName;
  }
}
