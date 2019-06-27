package immutability;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author hlay
 * @version 1.0
 */
public class ImmutabilityShould {

  @Test
  public void return_true_when_setter_do_not_exist_in_project() {
    assertThat(isSetterDoNotExist()).isTrue();
  }

  @Test
  public void return_true_when_the_class_is_visibility_is_ok() {
    assertThat(Modifier.isFinal(Immutability.class.getModifiers())).isTrue();
  }

  @Test
  public void return_true_when_the_current_entity_is_ok() {
    assertThat(Arrays.stream(Entity.class.getDeclaredMethods())
        .noneMatch(this::isSetter)).isTrue();
  }

  // FIXME : make it works
  @Ignore
  @Test
  public void return_true_when_the_field_are_ok() throws IllegalAccessException {

    Immutability immutability = new Immutability();

    for (Field field : immutability.getClass().getDeclaredFields()) {

      field.setAccessible(true);

      if (field.getType().equals(List.class)) {
        field.set(immutability, Arrays.asList(1, 2, 3));
      }

      if (field.getType().equals(Entity.class)) {
        field.set(immutability, new Entity(5));
      }

      if (field.getType().equals(String.class)) {
        field.set(immutability, "12345");
      }
    }

    assertThat(immutability.getListOfEntity()).isEmpty();
    assertThat(immutability.getStringValue()).isEqualTo("defaultValue");
    assertThat(immutability.getCurrentEntity().getId()).isEqualTo(0);
  }

  @Test
  public void return_true_when_the_list_is_ok() {
    Immutability immutability = new Immutability();
    List<Entity> listOfEntity = immutability.getListOfEntity();

    try {
      listOfEntity.add(new Entity(1));
      listOfEntity.add(new Entity(2));
      Entity entity3 = new Entity(3);
      listOfEntity.add(entity3);
      listOfEntity.add(new Entity(4));

      listOfEntity.remove(entity3);
    } catch (Exception e) {
      // in case of a unmodifiable list
    }

    assertThat(immutability.getListOfEntity()).isEmpty();
  }

  // FIXME : do it with the interface !!!
  @Ignore
  @Test
  public void return_true_when_the_element_in_the_list_are_ok() {
  }

  private boolean isSetterDoNotExist() {
    return Arrays.stream(Immutability.class.getDeclaredMethods())
        .noneMatch(this::isSetter);
  }

  public boolean isSetter(Method method) {
    return Modifier.isPublic(method.getModifiers()) &&
        method.getReturnType().equals(void.class) &&
        method.getParameterTypes().length == 1 &&
        method.getName().matches("^set[A-Z].*");
  }
}
