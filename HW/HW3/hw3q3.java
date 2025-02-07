package HW.HW3;
import java.util.Random;
import java.util.Scanner;

/*
6.30 (Guess the Number) Write an application that plays "guess the number" as follows: Your
program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
The application displays the prompt Guess a number between 1 and 1000. The player inputs a first
guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
low. Try again. to help the player "zero in" on the correct answer. The program should prompt the
user for the next guess. When the user enters the correct answer, display Congratulations. You
guessed the number!, and allow the user to choose whether to play again. [Note: The guessing tech-
nique employed in this problem is similar to a binary search, which is discussed in Chapter 19,
Searching, Sorting and Big O.]
*/
public class hw3q3 {

    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(1000) + 1;
        int guess = 0;
        int count = 0;

        Scanner input = new Scanner(System.in);

        while (guess != num) {
            System.out.print("Guess a number between 1 and 1000: ");
            guess = input.nextInt();
            count++;
            if (guess < num) {
                System.out.println("Too low. Try again.");
            }
            else if (guess > num) {
                System.out.println("Too high. Try again.");
            }
            else if (guess == num) {
                System.out.println("Congratulations! You guessed the number in " + count + " tries.");
            }
            else {
                System.out.println("Invalid input. Try again.");
            }
        }

        input.close();
    }
    
}
