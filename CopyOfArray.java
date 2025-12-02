/**
 * Program Name: CopyOfArray
 * Description : This program accepts the size of an array from the user.
 *               It then accepts elements, stores them in an original array,
 *               copies them into another array, and prints both arrays.
 *               Enter 0 to stop the program.
 *
 * Author      : Pooja Kadam
 */

package com.basic.ArraysCodes;

import java.util.Scanner;

public class CopyOfArray {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        while (true) {  // Loop runs until user enters 0

            System.out.println("Enter the size (or enter 0 to stop):");
            int size = sc.nextInt();

            // Condition to stop the program
            if (size == 0) {
                System.out.println("Program ended");
                break;
            }

            // Array creation
            int original[] = new int[size];
            int copy[] = new int[size];

            System.out.println("Enter " + size + " elements:");

            // Read values and copy them simultaneously
            for (int i = 0; i < size; i++) {
                original[i] = sc.nextInt();  // Store input in original array
                copy[i] = original[i];       // Copy value to copy array
            }

            // Printing original array
            System.out.println("Original Array:");
            for (int num : original) {
                System.out.println(num);
            }

            // Printing copied array
            System.out.println("Copied Array:");
            for (int copiedNum : copy) {
                System.out.println(copiedNum);
            }
        }

        sc.close();  // Closing scanner
    }
}
