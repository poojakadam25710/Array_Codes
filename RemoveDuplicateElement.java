/**
 * Program Name: RemoveDuplicateElement
 * Description : This program removes duplicate elements from an integer array.
 *               It prints only the unique elements. The program continues to
 *               execute until the user enters '0' as the array size.
 * author      :  Pooja kadam
 */

package com.basic.ArraysCodes;

import java.util.Scanner;

public class RemoveDuplicateElement {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // Scanner to read user input

        while (true) { // Infinite loop until user chooses to stop

            // Ask user for array size
            System.out.println("Enter the size (or enter 0 to stop)");
            int size = sc.nextInt();

            // Exit condition when user enters 0
            if (size == 0) {
                System.out.println("Program ended");
                break;
            }

            // Create an array with the given size
            int arr[] = new int[size];

            // Take elements from the user
            System.out.println("Enter " + size + " Elements");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Display unique elements after removing duplicates
            System.out.println("Elements after removal of duplicate:");

            // Loop through each element of the array
            for (int i = 0; i < arr.length; i++) {

                boolean removeDuplicate = true; // Assume current element is unique

                // Compare arr[i] with elements to the right of it
                for (int j = i + 1; j < arr.length; j++) {

                    // If a duplicate value is found, mark as not unique
                    if (i != j && arr[i] == arr[j]) {
                        removeDuplicate = false;
                        break; // Stop checking further
                    }
                }

                // Print only if the element does NOT appear again later in the array
                if (removeDuplicate) {
                    System.out.println("Unique element: " + arr[i]);
                }
            }
        }

        sc.close(); // Close scanner after loop ends
    }
}
