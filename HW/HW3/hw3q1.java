package HW.HW3;
/*
Question:
6.9 (Rounding Numbers) Math. floor can be used to round values to the nearest integer-e.g.,
double y = Math.floor(x + 0.5);

will round the number x to the nearest integer and assign the result to y. Write an application that
reads double values and uses the preceding statement to round each of the numbers to the nearest
integer. For each number processed, display both the original number and the rounded number.

*/


import java.util.Scanner;

public class hw3q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        double num = input.nextDouble();
        double rounded = Math.floor(num + 0.5);

        System.out.println("The rounded number is " + rounded);

        input.close();
    }
}   