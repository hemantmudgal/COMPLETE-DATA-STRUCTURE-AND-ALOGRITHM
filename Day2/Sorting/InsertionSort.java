/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 05-06-2023
 *   Time: 23:38
 *   File: InsertionSort.java
 */

package Day2.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i-1;
           while(j >= 0 && array[j] > temp){
               array[j+1] = array[j];
               j--;
           }
           array[j+1] = temp;
        }
    }

}