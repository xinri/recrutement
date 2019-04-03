package com.refactoring.difficult.exercice1;


public class RomanNumber {

  public String convert(int number) {

    if (number == 1) {
      return "I";
    }

    if (number < 4) {
      String tmp = "";
      for (int i = 0; i < number; i++) {
        tmp += "I";
      }

      return tmp;
    }

    if (number == 4) {
      return "IV";
    }

    if (number == 5) {
      return "V";
    }

    if (number == 6) {
      return "VI";
    }

    if (number == 7) {
      return "VII";
    }

    if (number == 8) {
      return "VIII";
    }

    if (number == 9) {
      return "IX";
    }

    if (number >= 10 && number < 14) {
      String tmp = "X";

      for (int i=0; i< number - 10; i++) {
        tmp += "I";
      }
      return tmp;
    }

    if (number == 14) {
      return "XIV";
    }

    return "I";
  }
}
