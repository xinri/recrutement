package com.refactoring.difficult.exercice1;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.Test;

public class RomanNumberShould {

  @Test
  public void return_I_when_the_number_is_1() {
    // given
    RomanNumber romanNumber = new RomanNumber();

    // when
    String result = romanNumber.convert(1);

    // then
    assertThat(result).isEqualTo("I");
  }

  @Test
  public void return_II_when_the_number_is_2() {
    // given
    RomanNumber romanNumber = new RomanNumber();

    // when
    String result = romanNumber.convert(2);

    // then
    assertThat(result).isEqualTo("II");
  }

  @Test
  public void return_IV_when_the_number_is_4() {
    // given
    RomanNumber romanNumber = new RomanNumber();

    // when
    String result = romanNumber.convert(4);

    // then
    assertThat(result).isEqualTo("IV");
  }

  @Test
  public void return_V_when_the_number_is_5() {
    // given
    RomanNumber romanNumber = new RomanNumber();

    // when
    String result = romanNumber.convert(5);

    // then
    assertThat(result).isEqualTo("V");
  }

  @Test
  public void return_VI_when_the_number_is_6() {
    // given
    RomanNumber romanNumber = new RomanNumber();

    // when
    String result = romanNumber.convert(6);

    // then
    assertThat(result).isEqualTo("VI");
  }

  @Test
  public void return_IX_when_the_number_is_9() {
    // given
    RomanNumber romanNumber = new RomanNumber();

    // when
    String result = romanNumber.convert(9);

    // then
    assertThat(result).isEqualTo("IX");
  }

  @Test
  public void return_X_when_the_number_is_10() {
    // given
    RomanNumber romanNumber = new RomanNumber();

    // when
    String result = romanNumber.convert(10);

    // then
    assertThat(result).isEqualTo("X");
  }

  @Test
  public void return_XI_when_the_number_is_11() {
    // given
    RomanNumber romanNumber = new RomanNumber();

    // when
    String result = romanNumber.convert(11);

    // then
    assertThat(result).isEqualTo("XI");
  }

  @Test
  public void return_XIII_when_the_number_is_13() {
    // given
    RomanNumber romanNumber = new RomanNumber();

    // when
    String result = romanNumber.convert(13);

    // then
    assertThat(result).isEqualTo("XIII");
  }

  @Test
  public void return_XIV_when_the_number_is_14() {
    // given
    RomanNumber romanNumber = new RomanNumber();

    // when
    String result = romanNumber.convert(14);

    // then
    assertThat(result).isEqualTo("XIV");
  }
}
