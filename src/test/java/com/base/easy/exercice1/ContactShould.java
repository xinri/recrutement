package com.base.easy.exercice1;

import static org.assertj.core.api.Java6Assertions.assertThat;

import org.junit.Ignore;
import org.junit.Test;

public class ContactShould {

  @Test
  public void return_true_when_the_phone_finding_the_existing_number_06060606() {
    // given
    Contact contact = new Contact();
    contact.add(new Phone("Alexandra", "06060606"));

    // when
    boolean result = contact.findPhone(new Phone("Alexandra"));

    // then
    assertThat(result).isTrue();
  }

  @Test
  public void return_06060606_number_when_finding_the_number_of_alexandra() {
    // given
    Contact contact = new Contact();
    contact.add(new Phone("Alexandra", "06060606"));
    contact.add(new Phone("John", "07070707"));

    // when
    String result = contact.findNumberOf(new Phone("Alexandra"));

    // then
    assertThat(result).isEqualTo("06060606");
  }

  @Ignore
  @Test
  public void return_08080808_when_overriding_alexandra_phone_and_getting_it() {
    // given
    Contact contact = new Contact();
    contact.add(new Phone("Alexandra", "06060606"));
    contact.add(new Phone("John", "07070707"));

    // when
    contact.add(new Phone("Alexandra", "08080808"));
    String result = contact.findNumberOf(new Phone("Alexandra"));

    // then
    // What is the result to be expected ?
    assertThat(result).isEqualTo("???????");
  }
}
