import java.util.*;
import java.io.PrintStream;

/*
Add comments here
*/

class Main {
  static final PrintStream out = System.out;
  static final Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    ArrayList<Door> doors = new ArrayList<Door>();

    Door door1 = new Door();
    door1.setName("Side");
    door1.open();
    doors.add(door1);

    Door door2 = new Door();
    door2.setName("Front");
    door2.closed();
    doors.add(door2);

    Door door3 = new Door();
    door3.setName("Back");
    door3.closed();
    doors.add(door3);

    for(int i = 0; i < doors.size(); i++) {
      doors.get(i).output();
    }

    for(int i=0; i < doors.size(); i++){
      if(doors.get(i).isOpen()) {
        doors.get(i).closed();
      } else {
        doors.get(i).open();
      }
    }

    out.println("");

    for(int i = 0; i < doors.size(); i++) {
      doors.get(i).output();
    }
  }
}
