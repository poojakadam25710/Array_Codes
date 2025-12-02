/**
 * Program Name: SecondLargest
 * Description : This program reads an integer array from the user and finds 
 *               the second largest element in the array. The program continues 
 *               until the user enters '0' as the array size.
 * author      : Pooja kadam
 */

package com.basic.ArraysCodes;

import java.util.Scanner;

public class SecondLargest {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // Scanner object for user input

        while (true) {  // Loop runs until the user chooses to stop

            // Ask for array size
            System.out.println("Enter the size (or enter 0 to stop)");
            int size = sc.nextInt();

            // Exit condition
            if (size == 0) {
                System.out.println("Program ended");
                break;
            }

            // Create an array of given size
            int arr[] = new int[size];

            // Ask the user to enter array elements
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Initialize FirstLargest and secondLargest with the first element
            int FirstLargest = arr[0];
            int secondLargest = arr[0];

            // Loop through the array to find the largest and second largest
            for (int i = 0; i < arr.length; i++) {

                // If current element is greater than FirstLargest
                if (FirstLargest < arr[i]) {
                    secondLargest = FirstLargest; // update second largest
                    FirstLargest = arr[i];        // update first largest
                }

                // Condition for updating second largest:
                // - arr[i] should be greater than current second largest
                // - arr[i] should NOT be equal to FirstLargest (to avoid duplicates)
                else if (secondLargest < arr[i] && arr[i] != FirstLargest) {
                    secondLargest = arr[i];
                }
            }

            // Display the second largest number
            System.out.println("Second largest element in the array is: " + secondLargest);
        }

        sc.close(); // Closing the scanner
    }
}
