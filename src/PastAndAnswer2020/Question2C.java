package PastAndAnswer2020;

import java.util.Scanner;

//This Program is to calculate the average Score of a student using while loop
public class Question2C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int $numOfExams = 0;
        double Scores = 0; // initialize the Score Variable using the double data type
        while ($numOfExams < 10) {
            System.out.println("You can enter " + (10 - $numOfExams) + " Exams Scores");
            System.out.println("Enter the Score for " + "Exam " + ($numOfExams + 1) + ":");
            int inputScore = sc.nextInt();
            Scores = Scores + inputScore; // sums the total scores enters

            $numOfExams++; // auto-increment $numOfExams
        }
//        Calculate the average using the Mathematics Average formula

        /*
        *
        * average = total number/ number

        *  AverageScore should be a double data type so that we can print the decimals
        *
        * * */

        double AverageScore = Scores/ $numOfExams;

        System.out.println("Your Average Score is: " + AverageScore);

    }
}
