/*
Traditional password entry schemes are susceptible to “shoulder surfing” in which an attacker watches an unsuspecting user enter his or her password or PIN number and uses it later to gain access to the account. One way to combat this problem is with a randomized challenge-response system. In these systems, the user enters different information every time based on a secret in response to a randomly generated challenge. Consider the following scheme in which the password consists of a five-digit PIN number (00000 to 99999). Each digit is assigned a random number that is 1, 2, or 3. The user enters the random numbers that correspond to their PIN instead of their actual PIN numbers.

For example, consider an actual PIN number of 12345. To authenticate it, the user would be presented with a screen such as the following:

PIN: 0 1 2 3 4 5 6 7 8 9

NUM: 3 2 3 1 1 3 2 2 1 3
The user would enter 23113 instead of 12345. This does not divulge the password even if an attacker intercepts the entry because 23113 could correspond to other PIN numbers, such as 69440 or 70439. The next time the user logs in, a different sequence of random numbers would be generated, such as the following:

PIN: 0 1 2 3 4 5 6 7 8 9

NUM: 1 1 2 3 1 2 2 3 3 3
Your program should simulate the authentication process. Store an actual PIN number in your program. The program should use an array to assign random numbers to the digits from 0 to 9. Output the random digits to the screen, input the response from the user, and output whether or not the user’s response correctly matches the PIN number.
*/


import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

class progAssign0 {
  static final Scanner in = new Scanner(System.in);
  static final PrintStream out = System.out;
  public static void main(String[] args) {
    int input = 0;
    out.println("Welcome! To log in, enter the random digits from 1-3 that correspond to your PIN number");
    out.println("");
    out.println("PIN digit: 0 1 2 3 4 5 6 7 8 9");
    out.print("Random #: ");
    randomDigits();
    out.println("");
    out.println("");

    out.println("Enter Code:");
    input = in.nextInt();
    if(!checkValid(input)) {
      out.println("Incorrect Credentials Entered!");
      out.println("alertSecurity() has been initialized");
    } else {
      out.println("Correct! You may proceed");
    }
  }

  public static void randomDigits() {
    Random rand = new Random();
    int max = 3;
    int min = 1;
    int range = max-min+1;
    for(int i = 0; i < 10; i++) {
      int randnum = 0;
      randnum = (int)(Math.random() * range) + 1;
      out.print(" " + randnum);
    }
  }

  public static boolean checkValid(int input) {
    String str = String.valueOf(input);
    if(str.contains("4")) {
      return false;
    } else if(str.contains("5")) {
      return false;
    } else if(str.contains("6")) {
      return false;
    } else if(str.contains("7")) {
      return false;
    } else if(str.contains("8")) {
      return false;
    } else if(str.contains("9")) {
      return false;
    } else if(str.contains("0")) {
      return false;
    } else {
      return true;
    }
  }
}
