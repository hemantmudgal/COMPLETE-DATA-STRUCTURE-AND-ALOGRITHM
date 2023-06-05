/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 23-02-2023
 *   Time: 01:24
 *   File: BubbleSort.java
 */

package Day2.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {4,3,8,6,1,50,0,1,2,0,9,2,2};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 1 ; j < array.length - i; j++){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
}