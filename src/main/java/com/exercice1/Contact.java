package com.exercice1;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Contact {

  // What is wrong here ?
  private static final Set<Phone> phoneDirectory = new HashSet<>();

  /**
   * add a new phone or override the existing one
   */
  public void add(Phone newPhone) {
    phoneDirectory.add(newPhone);
  }

  /**
   * find the phone number corresponding to a phone
   */
  public String findNumberOf(Phone phone) {
    Optional<Phone> optionalPhone = phoneDirectory.stream()
        .filter(phoneToFind -> phoneToFind.equals(phone))
        .findFirst();

    if (optionalPhone.isPresent()) {
      return optionalPhone.get().getPhoneNumber();
    }

    throw new IllegalStateException("phone not found");
  }

  /**
   * check if the phone exists
   */
  public boolean findPhone(Phone phone) {
    return phoneDirectory.contains(phone);
  }

  // What is wrong here ?
  public Set<Phone> getPhoneDirectory() {
    return phoneDirectory;
  }
}
