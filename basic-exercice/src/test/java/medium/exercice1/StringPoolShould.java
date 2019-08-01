package medium.exercice1;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Ignore;
import org.junit.Test;

public class StringPoolShould {

  @Test
  public void should_test_if_Frederic_is_the_same() {
    String frederic1 = "Frederic";
    String frederic2 = new StringPool().getFrederic();

    assertThat(frederic1 == frederic2).isTrue();
  }

  @Ignore
  @Test
  public void should_test_if_Frederic_is_the_same_2() {
    String frederic1 = "Frederic";
    String frederic2 = new StringPool().getFrederic2();

    assertThat(frederic1 == frederic2).isTrue();
  }
}