package easy.exercice4;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class MyStringUtilsShould {

  @Test
  public void return_minus_1_when_the_second_letter_of_aaa_is_not_a_Integer() {
    // given
    MyStringUtils myStringUtils = new MyStringUtils();

    // when
    Integer result = myStringUtils.getIntegerAt("aaa", 1);

    // then
    assertThat(result).isEqualTo(-1);
  }

  @Test
  public void return_5_when_retrieve_the_second_letter_of_a5b_and_cast_into_Integer() {
    // given
    MyStringUtils myStringUtils = new MyStringUtils();

    // when
    Integer result = myStringUtils.getIntegerAt("a5b", 1);

    // then
    assertThat(result).isEqualTo(5);
  }
}
