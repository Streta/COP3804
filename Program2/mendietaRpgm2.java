/*********************************************************************
 * Author : Roosevelt Mendieta Course: Java - 2 Professor: Michael Robinson
 * Program #: 2
 * 
 * Due Date : 06/12/2019
 * 
 * 
 * Certification: I hereby certify that this work is my own and none of it is
 * the work of any other person.
 * 
 * ..........{ Roosevelt Mendieta }..........
 *********************************************************************/

public class mendietaRpgm2 {

    public void one() {
        mendietaRAL x = new mendietaRAL();
        x.theArrayList();
    }

    public void two() {
        mendietarConstructor msg = new mendietarConstructor();
        System.out.printf("%s\n", msg);

        System.out.printf("--- Initial Values --- \n");
        mendietarConstructor one = new mendietarConstructor(0, "Empty", 0.0);
        System.out.printf("%s\n", one.getValues());
        System.out.println();

        System.out.printf("--- Assigned Joe ---\n");
        mendietarConstructor two = new mendietarConstructor("Joe");
        System.out.printf("%s\n", two.getValues());
        System.out.println();

        System.out.printf("--- Assigned 123 & Joe ---\n");
        mendietarConstructor three = new mendietarConstructor(123, "Joe");
        System.out.printf("%s\n", three.getValues());
        System.out.println();

        System.out.printf("--- Assigned 12.00, 123, & Joe ---\n");
        mendietarConstructor four = new mendietarConstructor(123, "Joe", 12.00);
        System.out.printf("%s\n", four.getValues());
        System.out.println();
    }
}
