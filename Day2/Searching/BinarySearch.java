/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 21-02-2023
 *   Time: 23:11
 *   File: BinarySearch.java
 */

package Day2.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        //For Binary Search Array should be sorted first.
        int[] sortedArray = {1, 4, 6, 10, 15, 20, 21, 24};
        int value = 24;
        int outputIndex = findIndexUsingBinarySearch(sortedArray, value);
        System.out.println("Index of " + value + " is : " + outputIndex);
    }

    /*
    * Method for find out the value in the sorted array using binary search.
    * */
    private static int findIndexUsingBinarySearch(int[] sortedArray, int value) {
        int startIndex = 0; // starting index of the array
        int endIndex = sortedArray.length - 1; // ending index of the array

        /*
        (startIndex <= endIndex)
        only check where end index is lesser than the start index of the array.
        * */
        while (startIndex <= endIndex) {
            // Calculating mid-index for each start and end index until we found our value in the given array.
            int midIndex = (startIndex + endIndex) / 2;
            // If value is greater than the mid-index value of the array search for the right part of the array.
            if (sortedArray[midIndex] < value) {
                startIndex = midIndex + 1;
            }
            // If value is lesser than the mid-index value of the array search for the left part of the array.
            else if (sortedArray[midIndex] > value) {
                endIndex = midIndex - 1;
            } else {
                return midIndex;
            }
        }
        return -1;
    }
}