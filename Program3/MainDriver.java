public class MainDriver {
  public static void main(String args[]) {
    mendietaRSuperPgm3 one = new mendietaRSuperPgm3();
    mendietaRSub1 two = new mendietaRSub1();
    mendietaRSub2 three = new mendietaRSub2();

    one.methodOne(1);
    one.methodTwo("SuperOne", "SuperTwo");
    one.methodThree();

    System.out.printf("\n");

    two.methodOne(2);
    two.methodTwo("SubOne", "SubTwo");
    two.methodThree();

    System.out.printf("\n");

    three.methodOne(3);
    three.methodTwo("SubTwo", "SubTwo");
    three.methodThree();
  }
}