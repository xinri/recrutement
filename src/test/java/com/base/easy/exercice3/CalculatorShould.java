package com.base.easy.exercice3;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.Test;

public class CalculatorShould {

  @Test
  public void return_0_1_when_removing_0_2_to_0_3() {
    // given
    Calculator calculator = new Calculator();

    // when
    double result = calculator.subtract(0.3d, 0.2d);

    // then
    assertThat(result).isEqualTo(0.1d);
  }
}
