package immutability;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hlay
 * @version 1.0
 */
public class Immutability implements AddValue {

  private List<Entity> listOfEntity;
  private String stringValue;
  private Entity currentEntity;

  public Immutability() {
    this.listOfEntity = new ArrayList<>();
    this.stringValue = "defaultValue";
    this.currentEntity = new Entity(0);
  }

  public List<Entity> getListOfEntity() {
    return listOfEntity;
  }

  public void setListOfEntity(List<Entity> listOfEntity) {
    this.listOfEntity = listOfEntity;
  }

  public String getStringValue() {
    return stringValue;
  }

  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }

  public Entity getCurrentEntity() {
    return currentEntity;
  }

  public void setCurrentEntity(Entity currentEntity) {
    this.currentEntity = currentEntity;
  }
}
