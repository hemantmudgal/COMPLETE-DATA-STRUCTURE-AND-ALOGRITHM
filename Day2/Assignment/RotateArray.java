/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 16-06-2023
 *   Time: 00:19
 *   File: RotateArray.java
 */

package Day2.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {2,6,3,1,5,9,8};
        int shifts = new Scanner(System.in).nextInt();
        rotateArrayFirstApproach(array,shifts);
        System.out.println(Arrays.toString(array));
        int[] array1 = {2,6,3,1,5,9,8};
        rotateArraySecondApproach(array1,shifts);
        System.out.println(Arrays.toString(array1));
        int[] array2 = {2,6,3,1,5,9,8};
        rotateArrayThirdApproach(array2,shifts);
        System.out.println(Arrays.toString(array2));

    }

    private static void rotateArrayThirdApproach(int[] array1, int shifts) {
        //2,6,3,1,5,9,8 --> 8,9,5,1,3,6,2 -->
        reverseArray(array1,0,array1.length-1);
        reverseArray(array1,0,shifts);
        reverseArray(array1,shifts+1,array1.length-1);
    }

    public static void reverseArray(int[] array,int startIndex, int endIndex){
        while(startIndex <= endIndex){
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

    private static void rotateArrayFirstApproach(int[] array, int shifts) {
        //2,6,3,1,5,9,8
        for (int i = 0 ; i < shifts; i++){
            int temp = array[0];
            for (int j = 0; j < array.length-1; j++) {
                array[j] = array[j+1];
            }
            array[array.length - 1] =  temp;
        }
    }

    private static void rotateArraySecondApproach(int[] array, int shifts) {
        //2,6,3,1,5,9,8
        int[] newArray = new int[shifts];
        for (int i = 0; i < shifts; i++) {
            newArray[i] = array[i];
        }
        for (int i = 0; i < array.length - shifts; i++) {
            array[i] = array[i+shifts];
        }
        int startIndex = 0;
        for (int i = array.length - shifts; i < array.length; i++){
            array[i] = newArray[startIndex];
            startIndex++;
        }
    }
}