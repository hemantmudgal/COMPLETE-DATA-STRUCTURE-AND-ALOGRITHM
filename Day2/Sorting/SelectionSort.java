/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 22-02-2023
 *   Time: 23:12
 *   File: SelectionSort.java
 */

package Day2.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 0, 4, 2, 7, 0, 9, 2, -2, -10, 23};
        findSortedArray(array);
        System.out.println(Arrays.toString(array));
    }

    /*
     * In Selection Sort we wound out the minimum element in the array and swap that element
     * at the index 0 then move to rest of the array then found out the minimum element again and
     * move te swap index then swap the values.*/
    private static void findSortedArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minValue = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    private static void swap(int[] array, int i, int minIndex) {
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
    }
}