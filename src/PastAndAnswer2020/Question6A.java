package PastAndAnswer2020;

import java.util.Random;
import java.util.stream.IntStream;

public class Question6A {
    public static void main(String[] args) {

        Random Rd = new Random();

//    First Method
        long RechargePin;

        RechargePin = Math.round(Math.random() *1000000000000L);


        System.out.println(RechargePin);




//        Second method
        long RechargePin2 = Math.round(Rd.nextFloat() * Math.pow(10, 12));

        System.out.println(RechargePin2);


        
    }
}
