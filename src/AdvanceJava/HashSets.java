package AdvanceJava;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
public class HashSets {
    public static void main(String[] args) {
ArrayList<String> x = new ArrayList<String>();
x.add("John");
x.add("Moses");
// initial State
        HashSet <String> cars = new HashSet<String>(x);
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
    }
}
