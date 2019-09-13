import java.util.*;
import java.io.PrintStream;

class comboLock {

  static final PrintStream out = System.out;
  static final Scanner in = new Scanner(System.in);

  private int secret1;
  private int secret2;
  private int secret3;
  int dial = 0;
  int totalNumbers = 40;

  void reset() {
    dial = 0;
  }

  void setSecret1(int s) {
    secret1 = s;
  }

  void setSecret2(int s) {
    secret2 = s;
  }

  void setSecret3(int s) {
    secret3 = s;
  }

  void turnLeft(int ticks) {
    dial = 0;
    if(dial - ticks >= 0) {
      dial = dial - ticks;
    } else {
      dial = totalNumbers - ticks + dial;
    }
  }

  void turnRight(int ticks) {
    dial = 0;
    if(dial + ticks < totalNumbers) {
      dial += ticks;
    } else {
      dial = (dial + ticks) % totalNumbers;
    }
  }

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

  int getInput(String s) {
    int guess;
    do {
      out.print(s);
      guess = in.nextInt();
    } while (guess < 0 || guess > 40);

    return guess;
  }
}
