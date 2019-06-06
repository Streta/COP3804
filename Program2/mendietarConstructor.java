
public class mendietarConstructor {
    private String welcome = "";
    private int first = 0;
    private double second = 0.0;

    public mendietarConstructor(String welcome) {
        this.welcome = welcome;
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
