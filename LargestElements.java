/**
 * Program Name : LargestElements
 * Description  : This program finds the largest element in an array.
 *                It keeps running until the user enters 0 as the size.
 * Author       : Pooja kadam
 */

package com.basic.ArraysCodes;

import java.util.Scanner;

public class LargestElements {
    public static void main(String args[]) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask user for array size
            System.out.print("Enter a size (or type 0 to stop): ");
            int size = sc.nextInt();

            // Exit condition
            if (size == 0) {
                System.out.println("Program ended");
                break;
            }

            // Declare array of given size
            int[] arr = new int[size];

            // Taking input from user
            System.out.println("Enter " + size + " elements:");

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Initialize largest after array is filled
            int largest = arr[0];

            // Finding the largest element
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }

            // Display the largest element
            System.out.println("The largest element in the array is → " + largest);
            System.out.println(); // blank line for readability
        }

        sc.close(); // closing scanner
    }
}
