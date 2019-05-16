package com.base.easy.exercice1;

import java.util.HashSet;
import java.util.Set;

public class PositionHistoryImproved {

  private final static Set<PositionImproved> setOfPosition = new HashSet<>();

  public void add(PositionImproved position) {
    setOfPosition.add(position);
  }

  public boolean isInThePath(PositionImproved position) {
    return setOfPosition.contains(position);
  }
}
