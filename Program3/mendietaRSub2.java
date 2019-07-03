public class mendietaRSub2 extends mendietaRSuperPgm3 {
  public void methodOne(int userInt) {
    System.out.printf("This is your value recieved: %d\n", userInt);
  }

  public void methodTwo(String stringOne, String stringTwo) {
    System.out.printf("Hello I am sub class two!\n");
  }

  public void methodThree() {
    System.out.printf("I am the super methodThree\n");
  }
}