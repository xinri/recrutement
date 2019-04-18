package com.base.easy.exercice0;

import java.util.ArrayList;
import java.util.List;

public class PositionHistory {

  private final static List<Position> listOfPosition = new ArrayList<>();

  public void add(Position position) {
    listOfPosition.add(position);
  }

  public boolean isInThePath(Position position) {
    return listOfPosition.contains(position);
  }
}
