/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 15-06-2023
 *   Time: 23:22
 *   File: PushAllZeroToEnd.java
 */

package Day2.Assignment;

import java.util.Arrays;

public class PushAllZeroToEnd {
    public static void main(String[] args) {
        int[] array = new int[]{2, 6, 0, 0, 1, 9, 0, 8, 0};
        pushAllZeroInAscendingOrder(array);
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[] {0,0,12,40,2,40,209,0,1,2,0};
        pushAllZeroInAscendingOrder(array2);
        System.out.println(Arrays.toString(array2));
    }


    //Only for increasing order
    public static void pushAllZeroInAscendingOrder(int[] array) {
        int startIndex = 0;
        int nonZeroElementIndex = 0;
        while(startIndex < array.length - 1){
            //{2, 6, 0(k=1), 0, 1(i=3), 9, 0, 8, 0};
            if(array[startIndex] != 0){
                int temp = array[startIndex];
                array[startIndex] = array[nonZeroElementIndex];
                array[nonZeroElementIndex] = temp;
                startIndex++;
                nonZeroElementIndex++;
            }else if(array[startIndex] == 0){
                startIndex++;
            }
        }
    }

    //For any order
    public static void pushAllZeroToEnd(int[] array) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            if (array[startIndex] == 0 && array[endIndex] != 0) {
                int temp = array[startIndex];
                array[startIndex] = array[endIndex];
                array[endIndex] = temp;
                startIndex++;
                endIndex--;
            }
            if (array[endIndex] == 0) {
                endIndex--;
            }
            if (array[startIndex] != 0) {
                startIndex++;
            }
        }
    }
}