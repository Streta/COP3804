
/*********************************************************************
 Author    : Roosevelt Mendieta 
 Course    : Java 2
 Professor : Michael Robinson 
 Program # : 4

 Due Date  : 07/14/2019


 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Roosevelt Mendieta }..........
*********************************************************************/

import java.io.*;
import java.util.*;

public class mendietaRpgm4 {
  public static void main(String args[]) throws java.io.IOException {
    System.out.printf("%s", theLinkedList());
    System.out.printf("%s", theQueue());
    System.out.printf("%s", theStack());

  }

  public static String theLinkedList() throws java.io.IOException {
    ArrayList<Object> foo = new ArrayList<Object>();

    String output = " ";

    foo.add("mendieta");
    foo.add("java");
    foo.add("FIU");
    foo.add(4.00);

    output += System.out.printf("%s\n", foo);

    foo.remove(2);
    foo.remove(1);

    output += System.out.printf("%s\n", foo);
    output += System.out.printf("\n");
    return output;
  }

  public static String theStack() throws java.io.IOException {
    Stack<String> foo = new Stack<>();

    String output = " ";

    output += System.out.printf("Initial stack: %s\n", foo);

    foo.add("First");
    foo.add("Second");
    foo.add("Third");
    foo.add("Fourth");

    output += System.out.printf("Stack before clear: %s\n", foo);

    foo.clear();

    output += System.out.printf("Stack after clear: %s\n", foo);
    output += System.out.printf("\n");

    return output;
  }

  public static String theQueue() throws java.io.IOException {
    PriorityQueue<String> foo = new PriorityQueue<String>();

    String output = " ";

    output += System.out.printf("Initial queue: %s\n", foo);

    foo.offer("First");
    foo.offer("Second");
    foo.offer("Third");
    foo.offer("Fourth");

    output += System.out.printf("Queue before clear: %s\n", foo);

    foo.clear();

    output += System.out.printf("Queue after clear: %s\n", foo);
    output += System.out.printf("\n");

    return output;
  }

  public static void theFile() throws java.io.IOException {
    FileWriter writer = new FileWriter("./myFile.txt");
    BufferedWriter buffer = new BufferedWriter(writer);

    buffer.write(theQueue());
    buffer.write(theStack());
    buffer.write(theLinkedList());

    buffer.close();
  }
}