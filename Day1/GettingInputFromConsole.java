/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 20-02-2023
 *   Time: 23:11
 *   File: FetchingINput.java
 */

package Day1;

import java.util.Scanner;

public class GettingInputFromConsole {
    public static void main(String[] args) {
/*
        A simple text scanner which can parse primitive types and strings using regular expressions.
        A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace.
        The resulting tokens may then be converted into values of different types using the various next methods.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = scanner.nextInt();

        int output = firstNumber + secondNumber;

        System.out.println("Addition of two number is :" + output);


        System.out.println("Enter name");
        String name = scanner.next(); // Only consider first input or first token as input.
        System.out.println("Name: " + name);
        System.out.println("Enter anotherName");
        String anotherName = scanner.nextLine(); // Takes input for the entire line.
        System.out.println("AnotherName: " + anotherName);

        //Taking character input:

        char characterInput = scanner.next().charAt(0);


    }
}