package ex05.base;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String str1 = input.nextLine();
        int int1 = Integer.parseInt(str1);

        System.out.print("What is the second number? ");
        String str2 = input.nextLine();
        int int2 = Integer.parseInt(str2);

        int sum = int1 + int2;
        int diff = int1 - int2;
        int product = int1 * int2;
        int quotient = int1 / int2;

        String outputString = int1 + " + " + int2 + " = " + sum + "\n" + int1 + " - " + int2 + " = " + diff + "\n" + int1 + " * " + int2 + " = " + product + "\n" + int1 + " / " + int2 + " = " +  quotient;

        System.out.println(outputString);
    }
}
