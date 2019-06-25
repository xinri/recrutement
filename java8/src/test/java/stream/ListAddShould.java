package stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

/**
 * @author hlay
 * @version 1.0
 */
public class ListAddShould {
  @Test
  public void return_0_when_the_list_to_add_is_empty() {
    // given
    ListAdd recursiveAdd = new ListAdd();

    // when
    Integer result = recursiveAdd.calculate(Collections.emptyList());

    // then
    assertThat(result).isEqualTo(0);
  }

  @Test
  public void return_10_when_the_list_to_add_is_1_0_2_4_3() {
    // given
    ListAdd recursiveAdd = new ListAdd();

    // when
    Integer result = recursiveAdd.calculate(Arrays.asList(1, 0, 2, 4, 3));

    // then
    assertThat(result).isEqualTo(10);
  }
}
