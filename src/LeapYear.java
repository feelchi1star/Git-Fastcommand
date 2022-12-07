//Leap Year Program

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int y;
        System.out.println("Enter the year in four digits: ");
        y = sc.nextInt();
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {

            System.out.println("%d is a leap year");


        } else {
            System.out.println("%d is not a leap year");

        }
    }

}
