package easy.exercice0;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PositionHistoryShould {

  @Test
  public void return_true_when_position_is_already_store() {
    // given
    PositionHistory positionHistory = new PositionHistory();
    positionHistory.add(new Position(150, 150));

    // when
    boolean result = positionHistory.isInThePath(new Position(150, 150));

    // then
    assertThat(result).isTrue();
  }
}
