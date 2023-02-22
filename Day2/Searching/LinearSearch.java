/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-02-2023
 *   Time: 23:03
 *   File: LinearSearch.java
 */

package Day2.Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arrayInput = {1,2,3,421,33,4,2,23};
        int valueToBeSearched = 421;
        int outputIndex = FindValueInArray(arrayInput,valueToBeSearched);
        System.out.println("Index of value in array is: " + outputIndex);
    }

    /*
    Array :- When we declare array its initialize its default values in range 0 to n-1.
    --> Every array store reference of 0th index and length of array
    */

    private static int FindValueInArray(int[] arrayInput, int valueToBeSearched) {

        /*
        * Just traversing through the complete array and where ever we found out the value
        * then return the index of that array index
        */
        for(var i = 0; i < arrayInput.length; i++){
            if(arrayInput[i] == valueToBeSearched){
                return i;
            }
        }

        return -1;
    }
}