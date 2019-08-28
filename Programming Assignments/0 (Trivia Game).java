import java.util.*;
import java.io.PrintStream;

class trivia {
  static final PrintStream out = System.out;
  static final Scanner in = new Scanner(System.in);
  public static void main(String[] args) {
    int score = 0;
    String answer = "";
    ArrayList<String> questions = new ArrayList<>();
    ArrayList<String> answers = new ArrayList<>();
    ArrayList<Integer> scores = new ArrayList<>();
    ArrayList<Integer> usedIndexes = new ArrayList<>();

    questions.add("What is the only manmade object that is observable from the moon?");
    questions.add("Which common word changes its pronunciation when the first letter is captialized?");
    questions.add("What is the most popular drink in the world that does not contain alcohol?");
    questions.add("What is the only word in English ending in the letters 'mt'?");
    questions.add("What is the capital of Australia?");
    questions.add("Who lived at 221B, Baker Street, London?");
    questions.add("Who said E=mc2?");
    questions.add("How many squares are there on a chess board?");
    questions.add("Where do half of the world’s pigs live?");
    questions.add("What is the name of the Episode III in the Star Wars saga?")


    answers.add("The Great Wall of China");
    answers.add("Polish");
    answers.add("Coffee");
    answers.add("Dreamt");
    answers.add("Canberra");
    answers.add("Sherlock Holmes");
    answers.add("Einstein");
    answers.add("64");
    answers.add("China");
    answers.add("Revenge of the Sith");

    scores.add(3);
    scores.add(2);
    scores.add(1);
    scores.add(2);
    scores.add(3);
    scores.add(1);
    scores.add(1);
    scores.add(2);
    scores.add(3);
    scores.add(2);

    int min = 0;
    int max = questions.size() - 1;
    int i = 0;
    int asked = 1;
    int correct = 0;
    boolean ask = false;

    while (asked < 6) {
      while (ask == false){
        int range = max - min + 1;
        i = (int)(Math.random() * range);

        if(!(usedIndexes.contains(i))) {
          ask = true;
          usedIndexes.add(i);
        }
      }

      //question number and question
      out.println("Question " + asked);
      out.println(questions.get(i));

      //ask for answer
      answer = in.nextLine();

      //check if the answer is correct and give points for correct answers
      if(answer.toLowerCase().equals(answers.get(i).toLowerCase())) {
        out.println("That is correct!");
        score += scores.get(i);
        correct += 1;
      } else {
        out.println("Wrong. The correct answer is " + answers.get(i));
      }

      out.println("Your score is " + score);
      out.println("");
      out.println("");

      max = questions.size() - 1;
      asked += 1;
      ask = false;
    }

    out.println("Your final score was: " + score);
    out.println("You answered: " + correct + "/5 questions correctly");
  }
}
