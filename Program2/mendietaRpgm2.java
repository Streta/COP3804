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
        mendietarConstructor msg = new mendietarConstructor("Welcome to my empty constructor");

        System.out.printf("%s\n", msg.getString());
        msg.setInt(1);
        msg.setDouble(1.1);
        msg.setString("1");
        msg.setValues(44.28, "Something", 60);

        System.out.printf("--- Initial Values --- \n");
        System.out.printf("%s\n", msg.getValues());

        System.out.println();

        System.out.printf("--- Assigned Joe ---\n");
        msg.setString("Joe");
        System.out.printf("%s\n", msg.getValues());

        System.out.println();

        System.out.printf("--- Assigned 123 ---\n");
        msg.setInt(123);
        System.out.printf("%s", msg.getValues());

        System.out.println();

        System.out.printf("--- Assigned 12.0 ---");
        msg.setDouble(12.00);
        System.out.printf("\n%s", msg.getValues());
    }
}
