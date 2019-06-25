package stream;

import java.util.stream.IntStream;

/**
 * @author hlay
 * @version 1.0
 */
public class StreamDisplay {

  public static void main(String[] args) {
    IntStream.range(0, 10)
        .map(entier -> {
          System.out.println("entier before : " + entier);
          int entierNew = entier + 1;
          System.out.println("entier after : " + entierNew);
          return entierNew;
        });
  }
}
