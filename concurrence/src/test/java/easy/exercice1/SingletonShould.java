package easy.exercice1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * @author hlay
 * @version 1.0
 */
public class SingletonShould {

  @Test
  public void retrieve_the_same_instance_when_getting_the_instance_twice() {
    assertThat(Singleton.getInstance()).isNotNull().isSameAs(Singleton.getInstance());
  }
}
