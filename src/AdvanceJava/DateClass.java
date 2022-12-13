package AdvanceJava;

import java.time.LocalDate;

import  java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateClass {
    public static void main(String[] args) {

//local date
        LocalDate myObj = LocalDate.of(2019,5,23);


        System.out.println(myObj);

//        Local time

        LocalTime myTime = LocalTime.now();

        System.out.println(myTime);


//    Local date time
        LocalDateTime myDate = LocalDateTime.now();
        System.out.println(myDate.format(DateTimeFormatter.ofPattern("E, MMM dd yyyy")));
    }



}
