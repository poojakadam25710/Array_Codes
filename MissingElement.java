/**
 * ------------------------------------------------------------
 *  Program Name : MissingElement
 *  Description  : This program finds the missing number in a 
 *                 sequence of integers from 1 to N. 
 *                 The user provides an array containing N-1 
 *                 unique numbers, and the program calculates 
 *                 which number is missing using:
 *
 *                     Missing = (N * (N + 1) / 2) - Sum(array)
 *
 *  Author       : Pooja kadam
 * ------------------------------------------------------------
 */

package com.basic.ArraysCodes;

import java.util.Scanner;

public class MissingElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask user for array size or option to quit
            System.out.println("Enter the size of the array (or type 0 to stop):");
            int size = sc.nextInt();

            // If size is 0, end the program
            if (size == 0) {
                System.out.println("Program ended");
                break;
            }

            // Create the array with the given size
            int[] arr = new int[size];

            // Ask user to enter values into the array
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            // Ask user for the full range number (N)
            System.out.println("Enter the total number of elements (N):");
            int number = sc.nextInt();

            // Calculate the expected sum: 1 + 2 + 3 + ... + N
            int expectedSum = number * (number + 1) / 2;

            // Calculate actual sum of entered array values
            int actualSum = 0;
            for (int num : arr) {
                actualSum += num;
            }

            // Missing number is the difference
            int missingNumber = expectedSum - actualSum;

            System.out.println("The missing number is: " + missingNumber);
        }

        sc.close();
    }
}
