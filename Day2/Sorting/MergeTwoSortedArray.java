/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 06-06-2023
 *   Time: 01:24
 *   File: MergeTwoSortedArray.java
 */

package Day2.Sorting;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] input1 = {1, 4, 8, 10, 13, 17};
        int[] input2 = {2, 3, 5, 7, 9, 11, 12};
        int[] output = mergeTwoSortedArray(input1, input2);
        System.out.println(Arrays.toString(output));
    }

    private static int[] mergeTwoSortedArray(int[] input1, int[] input2) {
        int lengthOfFirstArray = input1.length;
        int lengthOfSecondArray = input2.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] output = new int[lengthOfFirstArray + lengthOfSecondArray];

        while (i < lengthOfFirstArray && j < lengthOfSecondArray) {
            if (input1[i] < input2[j]) {
                output[k] = input1[i];
                i++;
                k++;
            }else{
                output[k] = input2[j];
                j++;
                k++;
            }
        }

        while(i < lengthOfFirstArray){
            output[k] = input1[i];
            i++;
            k++;
        }

        while(j < lengthOfSecondArray){
            output[k] = input2[j];
            j++;
            k++;
        }

        return output;
    }
}