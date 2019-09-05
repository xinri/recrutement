package myinterface;

/**
 * @author hlay
 * @version 1.0
 */
@FunctionalInterface
public interface Functional {

  String test();
  //String test2();

  default String test123() {
    return "123";
  }
}
