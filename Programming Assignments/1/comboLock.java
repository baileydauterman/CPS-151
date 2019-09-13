import java.util.*;
import java.io.PrintStream;

//define comboLock class
class comboLock {
  //define variables for comboLock
  static final PrintStream out = System.out;
  static final Scanner in = new Scanner(System.in);

  private int secret1;
  private int secret2;
  private int secret3;
  int dial = 0;
  int totalNumbers = 40;

  //resets the dial to the top of the lock
  void reset() {
    dial = 0;
  }

  //sets the first part of the combolock
  void setSecret1(int s) {
    secret1 = s;
  }

  //sets the second part of the combolock
  void setSecret2(int s) {
    secret2 = s;
  }

  //sets the third part of the combolock
  void setSecret3(int s) {
    secret3 = s;
  }

  //sets the dial back to 0 and then maths for the amount of ticks in a turn
  void turnLeft(int ticks) {
    this.reset();
    if(dial - ticks >= 0) {
      dial = dial - ticks;
    } else {
      dial = totalNumbers - ticks + dial;
    }
  }

  //sets the dial back to 0 and then maths for the amount of ticks in a turn
  void turnRight(int ticks) {
    this.reset();
    if(dial + ticks < totalNumbers) {
      dial += ticks;
    } else {
      dial = (dial + ticks) % totalNumbers;
    }
  }

  //checks to see if the lock has been cracked, calls on the 3 boolean values and then gets user input from the getInput method uses if statement to set and check if the code has been cracked
  boolean isOpen() {
    boolean s1 = false;
    boolean s2 = false;
    boolean s3 = false;

    turnRight(getInput("Enter the 1st # of ticks (to the right): "));

    if (dial == secret1) {
      s1 = true;
    }

    turnLeft(getInput("Enter the 2nd # of ticks (to the left): "));

    if (dial == secret2) {
      s2 = true;
    }

    turnRight(getInput("Enter the 3rd # of ticks (to the right): "));

    if (dial == secret3) {
      s3 = true;
    }

    if (s1 && s2 && s3) {
      return true;
    } else {
      return false;
    }
  }

  //displays a prompt box for the user to enter their guess for the lock
  int getInput(String s) {
    int guess;
    do {
      out.print(s);
      guess = in.nextInt();
    } while (guess < 0 || guess > 40);

    return guess;
  }
}
