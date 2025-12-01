/**
 * ------------------------------------------------------------
 * Program Name : AverageOfArray
 * Description  : This program repeatedly accepts an array size
 *                from the user and then reads that many integers.
 *                It calculates and displays the average of the
 *                entered numbers.
 * 
 *                Entering 0 as the size will stop the program.
 *
 * Author       : Pooja kadam
 * ------------------------------------------------------------
 */
package com.basic.ArraysCodes;

import java.util.Scanner;

public class AverageOfArray {

    public static void main(String args[]) {

        // Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the size (or enter 0 to stop):");
            int size = sc.nextInt();

            // Terminate the program if user enters 0
            if (size == 0) {
                System.out.println("Program ended");
                break;
            }

            int sum = 0; // Variable to store the sum of array elements
            int[] numbers = new int[size]; // Array to store the input integers

            System.out.println("Enter " + size + " elements:");

            // Read array elements and calculate sum
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
                sum += numbers[i];
            }

            // Calculate average (integer division)
            int avg = sum / size;

            System.out.println("The average of the numbers is: " + avg);
        }

        // Close scanner resource
        sc.close();
    }
}
