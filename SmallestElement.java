/**
 * Program Name : SmallestElement
 * Description  : This program finds the smallest element in an array.
 *                It repeatedly asks for array size until the user enters 0.
 * Author       : Pooja kadam
 */

package com.basic.ArraysCodes;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String args[]) {

        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask user for size of the array
            System.out.print("Enter the size of array (or enter 0 to stop): ");
            int size = sc.nextInt();

            // If size is 0, stop the program
            if (size == 0) {
                System.out.println("Program ended");
                break;
            }

            // Create an array of the given size
            int[] arr = new int[size];

            // Taking input from the user for each element
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Assume first element is the smallest initially
            int smallest = arr[0];

            // Traverse the array to find the smallest element
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < smallest) {
                    smallest = arr[i];
                }
            }

            // Display the result
            System.out.println("The smallest element in the array is: " + smallest);
            System.out.println(); // blank line for readability
        }

        sc.close(); // Close Scanner to avoid resource leak
    }
}
