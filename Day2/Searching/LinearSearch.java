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

    private static int FindValueInArray(int[] arrayInput, int valueToBeSearched) {
        for(var i = 0; i < arrayInput.length; i++){
            if(arrayInput[i] == valueToBeSearched){
                return i;
            }
        }

        return -1;
    }
}