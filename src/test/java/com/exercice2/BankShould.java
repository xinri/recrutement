package com.exercice2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.Test;

public class BankShould {

  @Test
  public void return_accounts_more_than_500_euros_sorted_group_by_category_when_calling_special_call_function() {
    // given
    Account account1 = new Account("Martin1", "Particulier", 750d);
    Account account2 = new Account("Martin2", "Particulier", 499d);
    Account account3 = new Account("Martin3", "Particulier", 505d);
    Account account4 = new Account("Martin4", "Commercant", 480d);
    Account account5 = new Account("Martin5", "Commercant", 510d);
    Account account6 = new Account("Martin6", "Commercant", 430d);
    Account account7 = new Account("Martin7", "Bank", 520d);
    Account account8 = new Account("Martin8", "Bank", 521d);
    Account account9 = new Account("Martin9", "Bank", 519d);
    Account account10 = new Account("Martin10", "VIP", 501d);

    Bank bank = new Bank();
    bank.add(account1);
    bank.add(account2);
    bank.add(account3);
    bank.add(account4);
    bank.add(account5);
    bank.add(account6);
    bank.add(account7);
    bank.add(account8);
    bank.add(account9);
    bank.add(account10);

    // when
    Map<String, List<Account>> result = bank.specialCall();

    // then
    assertThat(result.get("Particulier").stream()
        .map(Account::getName)
        .collect(Collectors.toList())).containsExactly("Martin3", "Martin1");

    assertThat(result.get("Commercant").stream()
        .map(Account::getName)
        .collect(Collectors.toList())).containsExactly("Martin5");

    assertThat(result.get("Bank").stream()
        .map(Account::getName)
        .collect(Collectors.toList())).containsExactly("Martin9", "Martin7", "Martin8");

    assertThat(result.get("VIP").stream()
        .map(Account::getName)
        .collect(Collectors.toList())).containsExactly("Martin10");
  }
}
