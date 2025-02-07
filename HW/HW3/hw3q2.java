package HW.HW3;
import java.util.Random;
import java.util.Scanner;

/*
6.29 (Coin Tossing) Write an application that simulates coin tossing. Let the program toss a coin
each time the user chooses the "Toss Coin" menu option. Count the number of times each side of
the coin appears. Display the results. The program should call a separate method f1ip that takes no
arguments and returns a value from a Coin enum (HEADS and TAILS). [Note: If the program realistically
simulates coin tossing, each side of the coin should appear approximately half the time.]
*/
public class hw3q2 {

    public int flip(){
        Random rand = new Random();
        int coin = rand.nextInt(2);
        return coin;
    }

    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int total = 0;

        Scanner input = new Scanner(System.in);


        OUTER: 
        while (true) {
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            
            int choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    int coin = new hw3q2().flip();
                    total++;
                    if (coin == 0) {
                        heads++;
                        System.out.println("Coin Tossed: HEADS");
                    }
                    else {
                        tails++;
                        System.out.println("Coin Tossed: TAILS");
                    }       break;
                    
                case 2:
                    System.out.println("Total number of tosses: " + total);
                    System.out.println("Number of heads: " + heads);
                    System.out.println("Number of tails: " + tails);
                    break OUTER;
                default:
                    System.out.println("Error");
                    break;
            }

           
        }
        input.close();
    }

    
}
