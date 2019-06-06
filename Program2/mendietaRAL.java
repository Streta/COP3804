
import java.util.ArrayList;
import java.util.Arrays;

public class mendietaRAL {
    public static void theArrayList() {
        ArrayList<Object> theList = new ArrayList<Object>();

        theList.add(123);
        theList.add("Java");
        theList.add(3.75);
        theList.add("Summer C");
        theList.add(2018);

        for (int i = 0; i < theList.size(); i++) {
            System.out.printf("%s\n", theList.get(i).toString());
        }

        System.out.println();
        theList.remove(1);
        theList.remove(3);

        for (int i = 0; i < theList.size(); i++) {
            System.out.printf("%s\n", theList.get(i).toString());
        }
        System.out.println();
    }
}
