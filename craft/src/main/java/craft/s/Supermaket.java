package craft.s;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supermaket {

  private List<String> employeeNameList = new ArrayList<>();
  private Map<Integer, String> cashers = new HashMap<>();
  private Map<Integer, Double> totalAmountPerClient = new HashMap<>();

  public Supermaket() {
    initEmployee();
    initCasher();

    affectCasherToAnEmployee(1, "Jerome");
    affectCasherToAnEmployee(2, "Jerome");
    affectCasherToAnEmployee(3, "Adrien");
    affectCasherToAnEmployee(4, "Murielle");
    affectCasherToAnEmployee(5, "Steve");
    affectCasherToAnEmployee(6, "Clementine");
    affectCasherToAnEmployee(7, "Constance");
  }

  private void initEmployee() {
    addEmployee("Jerome");
    addEmployee("Adrien");
    addEmployee("Murielle");
    addEmployee("Steve");
    addEmployee("Clementine");
    addEmployee("Constance");
  }

  private void initCasher() {
    cashers.put(1, "");
    cashers.put(2, "");
    cashers.put(3, "");
    cashers.put(4, "");
    cashers.put(5, "");
    cashers.put(6, "");
    cashers.put(7, "");
  }

  public final void addEmployee(String employeeName) {
    employeeNameList.add(employeeName);
  }

  public final void affectCasherToAnEmployee(Integer casherId, String employeeName) {
    cashers.put(casherId, employeeName);
  }

  public void rotationCasher(Integer casherId, Integer casherIdToRotate) {
    String employee1 = cashers.get(casherId);
    String employeeToRotate = cashers.get(casherIdToRotate);

    cashers.put(casherId, employeeToRotate);
    cashers.put(casherIdToRotate, employee1);
  }

  public void createClient(Integer clientId) {
    totalAmountPerClient.put(clientId, 0d);
  }

  public void addArticleForClient(Integer clientId, double amount) {
    totalAmountPerClient.computeIfPresent(clientId, (key, oldValue) -> oldValue + amount);
  }
}
