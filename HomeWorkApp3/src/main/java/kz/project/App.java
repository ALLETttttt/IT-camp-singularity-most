package kz.project;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        guessNumber();
    }


    public static void guessNumber() {
        Random random = new Random();
        Scanner input = new Scanner(System.in);


        int attempts = 3;

        do {
            int randomNumber = random.nextInt(1,10);
            boolean target = false;
            System.out.println("System guessed number between 1 and 9: ");
            for (int i = 0; i < attempts; i++) {
                System.out.println("Enter your number: ");
                int inputNumber = input.nextInt();

                if (inputNumber == randomNumber) {
                    target = true;
                    System.out.println("Congratz!");
                }
                else if (inputNumber < randomNumber) {
                    System.out.println("Entered number is smaller than guessed");
                }
                else {
                    System.out.println("Entered number is bigger than guessed");
                }
            }
            if (!target) {
                System.out.println("You are lost, attempts is reached limit! Guessed number was: " + randomNumber);
            }
            System.out.println("Restart the game? 1 --> Yes  0 --> No");
        } while (input.nextInt() == 1);
        System.out.println("Bye!");
    }
}
