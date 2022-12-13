package AdvanceJava;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {

    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volve");
    cars.add("BmW");
        cars.add("Ford");
        cars.add("Mazda");
   for (String i : cars) {
      System.out.println(i);
    }

        Collections.sort(cars); // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
    }



}
