
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

import java.util.*;

public class mendietaRpgm4 {
  public static void main(String args[]) {
    theLinkedList();
    theStack();
    theQueue();
  }

  public static void theLinkedList() {
    ArrayList<Object> foo = new ArrayList<Object>();

    foo.add("mendieta");
    foo.add("java");
    foo.add("FIU");
    foo.add(4.00);

    System.out.println(foo);

    foo.remove(2);
    foo.remove(1);

    System.out.println(foo);
  }

  public static void theStack() {
    Stack<String> foo = new Stack<>();

    System.out.println("Initial stack: " + foo);

    foo.add("First");
    foo.add("Second");
    foo.add("Third");
    foo.add("Fourth");

    System.out.println("Stack before clear : " + foo);

    foo.clear();

    System.out.println("Stack after clear : " + foo);
  }

  public static void theQueue() {
    PriorityQueue<String> foo = new PriorityQueue<String>();

    System.out.printf("Initial queue: %s\n", foo);

    foo.offer("First");
    foo.offer("Second");
    foo.offer("Third");
    foo.offer("Fourth");

    System.out.printf("Queue before clear: %s\n", foo);

    foo.clear();

    System.out.printf("Queue after clear: %s\n", foo);
  }
}