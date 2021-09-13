/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Edouard
 */

package ex21;

import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");
        int number = input.nextInt();

        String month;
        switch (number) {
            case 1: month="January";
                System.out.print("The name of the month is "+month);
                break;
            case 2: month="February";
                System.out.print("The name of the month is "+month);
                break;
            case 3: month="March";
                System.out.print("The name of the month is "+month);
                break;
            case 4: month="April";
                System.out.print("The name of the month is "+month);
                break;
            case 5: month="May";
                System.out.print("The name of the month is "+month);
                break;
            case 6: month="June";
                System.out.print("The name of the month is "+month);
                break;
            case 7: month="July";
                System.out.print("The name of the month is "+month);
                break;
            case 8: month="August";
                System.out.print("The name of the month is "+month);
                break;
            case 9: month="September";
                System.out.print("The name of the month is "+month);
                break;
            case 10: month="October";
                System.out.print("The name of the month is "+month);
                break;
            case 11: month="November";
                System.out.print("The name of the month is "+month);
                break;
            case 12: month="December";
                System.out.print("The name of the month is "+month);
                break;
            default: System.out.print("Invalid (Must be between 1-12)");
                break;
        }
    }
}
