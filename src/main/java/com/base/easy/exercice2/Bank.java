package com.base.easy.exercice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Bank {

  private final List<Account> accountList = new ArrayList<>();

  public void add(Account account) {
    accountList.add(account);
  }

  /**
   * TO IMPLEMENT :
   *
   * the special call will :
   *
   * group by category and for each category,
   * we will have a list of account that is sorted by amount ascending.
   *
   * @return
   */
  public Map<String, List<Account>> specialCall() {
    return null;
  }
}
