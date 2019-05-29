package easy.exercice1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PositionHistoryImprovedShould {

  @Test
  public void return_true_when_position_is_already_store() {
    // given
    PositionHistoryImproved positionHistoryImproved = new PositionHistoryImproved();
    positionHistoryImproved.add(new PositionImproved(150, 150));

    // when
    boolean result = positionHistoryImproved.isInThePath(new PositionImproved(150, 150));

    // then
    assertThat(result).isTrue();
  }
}