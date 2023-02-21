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
        System.out.println("Index of " + value + " is :" + outputIndex);
    }

    private static int findIndexUsingBinarySearch(int[] sortedArray, int value){
        int startIndex = 0;
        int endIndex = sortedArray.length -1;

        while(startIndex <= endIndex){
            int midIndex = (startIndex + endIndex) / 2;

            if(sortedArray[midIndex] == value){
                return midIndex;
            }
            else if(sortedArray[midIndex] < value){
                startIndex = midIndex + 1;
            }
            else if(sortedArray[midIndex] > value){
                endIndex = midIndex - 1;
            }
        }
        return -1;
    }
}