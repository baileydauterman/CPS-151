/*
Array lists are objects that, like arrays, provide you the ability to store items sequentially and recall items by index. Working with array lists involves invoking ArrayList methods, so we will need to develop some basic skills.

Let’s start with a simple program.  Create a new program named ArrayListRunner using your favorite IDE (DrJava, Eclipse, NetBeans, etc.).  Then, import the ArrayListRunner.java source code file.


The main method in the ArrayListRunner class declares and creates an ArrayList with the identifier names that can hold strings. It also prints out the ArrayList. When we compile and execute this code, we see that the ArrayList is empty: [ ].

Complete the following tasks by adding code to this skeleton program. If you are asked to print a value or an array list, provide a suitable label to identify it when it is printed (e.g., last name: Harry, or names: [ ]).

[done] Call the ArrayList's add() method to enter the following names in sequence: Alice, Bob, Connie, David, Edward, Fran, Gomez, Harry.
[done] Print the ArrayList again.
 
[done] Call the ArrayList's get() method to retrieve and print the first and last names.
 
[done] Print the size() of the ArrayList.
 
[done] Use size() to help you print the last name in the list.
 
[done] Use set() to change “Alice” to “Alice B. Toklas”.
[done] Print the ArrayList to verify the change.
 
[done] Use the alternate form of add() to insert “Doug” after “David”.
[done] Print the ArrayList again.
 
[done] Use a loop (instead of a single call to System.out.println) to print each name in the ArrayList.
 
Create a second Array List called names2 that is built by calling the ArrayList constructor that accepts another ArrayList as an argument.
Pass names to the constructor to build names2.
Then print the ArrayList again.
 
Call names.remove(0) to remove the first element from the original ArrayList.
Print names and names2.
Verify that Alice B. Toklas was removed from names, but not from names2.
*/

import java.util.*;
import java.io.PrintStream;

class Main {
  static final PrintStream out = System.out;
  static final Scanner in = new Scanner(System.in);
  public static void main(String[] args) {

    //Alice, Bob, Connie, David, Edward, Fran, Gomez, Harry
    ArrayList<String> names = new ArrayList();
    names.add("Alice");
    names.add("Bob");
    names.add("Connie");
    names.add("David");
    names.add("Edward");
    names.add("Fran");
    names.add("Gomez");
    names.add("Harry");

    int last = names.size() - 1;
    out.println("names: " + names + "\n");
    out.println("First name in list: " +names.get(0));
    out.println("Last name in list: " + names.get(last) + "\n");
    out.println("List size: " + names.size() + "\n");

    names.set(0, "Alice B. Toklas");
    out.println("names: " + names + "\n");

    names.add(4, "Doug");
    out.println("names: " + names + "\n");

    for(int i = 0; i <= last; i++) {
      out.println("Name " + i + ": " + names.get(i));
    }
    out.println("");
    ArrayList<String> names2 = new ArrayList(names);

    names.remove(0);

    out.println("names: " + names + "\n");
    out.println("names2: " + names2 + "\n");
  }
}
