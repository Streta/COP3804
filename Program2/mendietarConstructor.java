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
public class mendietarConstructor {
    private String welcome = "";
    private int first = 0;
    private double second = 0.0;

    public mendietarConstructor() {
        System.out.printf("%s", "Welcome to the empty constructor");
    }

    public mendietarConstructor(String welcome) {
        this.welcome = welcome;
    }

    public mendietarConstructor(int first, String welcome) {
        this.first = first;
        this.welcome = welcome;
    }

    public mendietarConstructor(int first, String welcome, double second) {
        this.first = first;
        this.welcome = welcome;
        this.second = second;
    }

    public void setString(String userString) {
        this.welcome = userString;
    }

    public void setInt(int userInt) {
        this.first = userInt;
    }

    public void setDouble(double userDouble) {
        this.second = userDouble;
    }

    public void setValues(double userDouble, String userString, int userInt) {
        this.second = userDouble;
        this.welcome = userString;
        this.first = userInt;
    }

    public String getString() {
        return welcome;
    }

    public int getInt() {
        return first;
    }

    public double getDouble() {
        return second;
    }

    public String getValues() {
        String info = getDouble() + " " + getString() + " " + getInt();
        return info;
    }
}
