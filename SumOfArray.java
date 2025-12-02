/**
 * Program Name: SumOfArray
 * Description : This program takes the size of an array from the user.
 *               If the size is not zero, it accepts array elements,
 *               calculates their sum, and prints the result.
 *               If the user enters size 0, the program terminates.
 *
 * Author      : Pooja Kadam
 */

package com.basic.ArraysCodes;

import java.util.Scanner;

public class SumOfArray {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        while (true) {  // Loop continues until user enters size 0

            System.out.println("Enter the size of an array:");
            int size = sc.nextInt();

            // If size is 0, stop the program
            if (size == 0) {
                System.out.println("Program ended.");
                break;
            }

            // Create array of given size
            int arr[] = new int[size];

            System.out.println("Enter " + size + " elements:");

            int sum = 0;

            // Accept array elements and calculate sum
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i]; // Adding each element to sum
            }

            // Print final sum
            System.out.println("Sum of elements is: " + sum);
        }

        sc.close(); // Closing scanner
    }
}
