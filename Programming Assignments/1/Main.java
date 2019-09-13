import java.util.*;
import java.io.PrintStream;

class Main {
  static final PrintStream out = System.out;
  static final Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    Random r = new Random();
    comboLock cl = new comboLock();

    int s1 = r.nextInt(39);
    int s2 = r.nextInt(39);
    int s3 = r.nextInt(39);
    int i = 0;
    String tryAgain = "n";

    cl.setSecret1(s1);
    cl.setSecret2(s2);
    cl.setSecret3(s3);
    
    do {
      if (cl.isOpen()) {
        out.println("Congrats you have unlocked the lock!");
        tryAgain = "n";
      } else {
        out.println("You don't quite have it, would you like to try again? (y/n)");
        tryAgain = in.next();
      }
    } while(tryAgain.equals("Y") || tryAgain.equals("y"));

    out.println("Thanks for playing!");
  }
}
