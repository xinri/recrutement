package myinterface;

/**
 * @author hlay
 * @version 1.0
 */
public class FunctionalMain {

  private Functional func1;
  private Functional func2;
  private FunctionalImpl func3;

  public FunctionalMain() {
    this.func1 = new FunctionalImpl();
    this.func2 = new FunctionalImpl2();
    this.func3 = new FunctionalImpl2();
  }

  public static void main(String[] args) {
    FunctionalMain functionalMain = new FunctionalMain();
    System.out.println("func1 test : " + functionalMain.func1.test());
    System.out.println("func1 test123 : " + functionalMain.func1.test123());
    System.out.println("func2 test : " + functionalMain.func2.test());
    System.out.println("func2 test123 : " + functionalMain.func2.test123());
    System.out.println("func3 test : " + functionalMain.func3.test());
    System.out.println("func3 test123 : " + functionalMain.func3.test123());
  }

  class FunctionalImpl2 extends FunctionalImpl {

    @Override
    public String test() {
      return "Function 2";
    }

    @Override
    public String test123() {
      return "321";
    }
  }
}
