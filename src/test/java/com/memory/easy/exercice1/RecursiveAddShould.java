package com.memory.easy.exercice1;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.Ignore;
import org.junit.Test;

public class RecursiveAddShould {

  @Test
  public void return_0_when_the_list_to_add_is_empty() {
    // given
    RecursiveAdd recursiveAdd = new RecursiveAdd();

    // when
    Integer result = recursiveAdd.calculate(Collections.emptyList());

    // then
    assertThat(result).isEqualTo(0);
  }

  @Test
  public void return_10_when_the_list_to_add_is_1_0_2_4_3() {
    // given
    RecursiveAdd recursiveAdd = new RecursiveAdd();

    // when
    Integer result = recursiveAdd.calculate(Arrays.asList(1, 0, 2, 4, 3));

    // then
    assertThat(result).isEqualTo(10);
  }

  // TODO : remove this when the 2 first tests passed.
  @Ignore
  @Test
  public void return_100000_when_the_list_is_adding_the_100000_time_1() {
    // given
    RecursiveAdd recursiveAdd = new RecursiveAdd();

    // when
    Integer result = recursiveAdd.calculate(Collections.nCopies(100000, 1));

    // then
    assertThat(result).isEqualTo(100000);
  }
}
