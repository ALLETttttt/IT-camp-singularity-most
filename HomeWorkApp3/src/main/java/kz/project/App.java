package kz.project;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        guessWord();
//        guessNumber();
    }


    public static Scanner getInput() {
        return new Scanner(System.in);
    }

    public static Random getRandom() {
        return new Random();
    }

    public static void guessNumber() {
        int attempts = 3;

        do {
            int randomNumber = getRandom().nextInt(1, 10);
            boolean target = false;
            System.out.println("System guessed number between 1 and 9: ");
            for (int i = 0; i < attempts; i++) {
                System.out.println("Enter your number: ");
                int inputNumber = getInput().nextInt();

                if (inputNumber == randomNumber) {
                    target = true;
                    System.out.println("Congratz!");
                    break;
                } else if (inputNumber < randomNumber) {
                    System.out.println("Entered number is smaller than guessed");
                } else {
                    System.out.println("Entered number is bigger than guessed");
                }
            }
            if (!target) {
                System.out.println("You are lost, attempts is reached limit! Guessed number was: " + randomNumber);
            }
            System.out.println("Restart the game? 1 --> Yes  0 --> No");
        } while (getInput().nextInt() == 1);
        System.out.println("Bye!");
    }


    public static void guessWord() {
        String[] words = {
                "apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
        };

        String guessedWord = words[getRandom().nextInt(0, 26)];

        do {
            boolean point = true;
            System.out.print("Guess the word: ");
            String enteredWord = getInput().next();

            StringBuilder rightChars = new StringBuilder();
            for (int i = 0; i < guessedWord.length(); i++) {
                if (i < enteredWord.length() && guessedWord.charAt(i) == enteredWord.charAt(i)) {
                    rightChars.append(enteredWord.charAt(i));
                } else {
                    for (int j = 0; j < 15 - rightChars.length(); j++) {
                        rightChars.append('#');
                    }
                    point = false;
                }
            }
            if (point) {
                System.out.println("Congratz, you found it!");
                break;
            } else {
                System.out.println("Not correct: " + rightChars);
            }
        } while (true);
    }
}
