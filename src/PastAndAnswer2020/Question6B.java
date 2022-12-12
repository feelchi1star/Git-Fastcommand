package PastAndAnswer2020;

import java.util.Scanner;

import static java.lang.System.err;

public class Question6B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt(); // gets the input from the user in integer
        if (age > 17) {
            System.out.println("You are an Adult");

        } else {
            System.out.println("You are too Young");
        }

    }
}