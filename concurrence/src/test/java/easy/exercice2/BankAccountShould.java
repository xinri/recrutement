package easy.exercice2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Random;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author hlay
 * @version 1.0
 */
public class BankAccountShould {

  private BankAccount bankAccount;

  @Test
  public void should_return_a_balance_of_5_when_deposit_5() {
    bankAccount = new BankAccount();

    bankAccount.deposit(5);

    assertThat(bankAccount.getBalance()).isEqualTo(5);
  }

  @Test
  public void should_return_a_balance_of_10_when_withdraw_5_when_balance_is_15() {
    bankAccount = new BankAccount();

    bankAccount.deposit(15);
    bankAccount.withdraw(5);

    assertThat(bankAccount.getBalance()).isEqualTo(10);
  }

  @Ignore("To remove later")
  @Test
  public void should_have_balance_of_1000_when_deposit_and_withdrawal_concurrently()
      throws InterruptedException {
    bankAccount = new BankAccount();

    bankAccount.deposit(1000);

    adjustBalanceConcurrently();

    assertThat(bankAccount.getBalance()).isEqualTo(1000);
  }

  private void adjustBalanceConcurrently()
      throws InterruptedException {
    Random random = new Random();

    Thread[] threads = new Thread[1000];
    for (int i = 0; i < 1000; i++) {
      threads[i] = new Thread(() -> {
        try {
          bankAccount.deposit(5);
          Thread.sleep(random.nextInt(10));
          bankAccount.withdraw(5);
        } catch (InterruptedException ignored) {
        }
      });
      threads[i].start();
    }

    for (Thread thread : threads) {
      thread.join();
    }
  }
}
