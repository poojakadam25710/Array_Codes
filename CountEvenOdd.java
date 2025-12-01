/**
 * Program Name : CountEvenOdd
 * Description  : This program counts how many even and odd numbers are present in an array.
 *                The program keeps running until the user enters 0 as the size.
 * Author       : Pooja kadam
 */

package com.basic.ArraysCodes;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Loop continues until the user enters '0'
        while (true) {

            // Asking user for array size
            System.out.print("Enter the size of an Array (or type '0' to stop): ");
            int size = sc.nextInt();

            // Program termination condition
            if (size == 0) {
                System.out.println("Program Ended");
                sc.close();
                break;
            }

            // Creating array of given size
            int[] ar = new int[size];

            // Counters for even and odd numbers
            int even = 0;
            int odd = 0;

            // Reading array elements from user
            System.out.println("Enter " + size + " elements:");

            for (int i = 0; i < size; i++) {
                ar[i] = sc.nextInt();

                // Counting even and odd numbers
                if (ar[i] % 2 == 0) {
                    even++; // Increment even count
                } else {
                    odd++;  // Increment odd count
                }
            }

            // Displaying results
            System.out.println("Count of Even Numbers : " + even);
            System.out.println("Count of Odd Numbers  : " + odd);
            System.out.println(); // Blank line for readability
        }
    }
}
