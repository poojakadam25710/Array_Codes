/**
 * Program Name : SortArrayJava
 * Description  : This program accepts an array from the user and sorts its
 *                elements in ascending order using a simple comparison-based
 *                sorting method (similar to selection sort). The program keeps
 *                running repeatedly until the user enters '0' as the array size.
 *
 * Author       : Pooja Kadam
 */

package com.basic.ArraysCodes;

import java.util.Scanner;

public class SortArrayJava {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // Scanner to read user input

        while (true) {  // Loop continues until user chooses to stop

            // Ask user to enter array size
            System.out.println("Enter the size (or enter 0 to stop)");
            int size = sc.nextInt();

            // Terminate program when user enters 0
            if (size == 0) {
                System.out.println("Program ended");
                break;
            }

            // Create an array of the given size
            int arr[] = new int[size];

            // Ask user to input elements into the array
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Sorting logic: compare each element with the ones after it
            for (int i = 0; i < arr.length; i++) {

                for (int j = i + 1; j < arr.length; j++) {

                    // Swap if element at i is greater than element at j
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

                // Print each element after placing it in sorted order
                System.out.println("Element at index " + i + " after sorting: " + arr[i]);
            }
        }

        sc.close(); // Closing scanner object
    }
}
