package AdvanceJava;
import java.util.HashMap;
public class HashMapObj {
    public static void main(String[] args) {

    HashMap <String,String> capitalCities = new HashMap<String,String>();

// Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities.get("USA"));
        System.out.println(capitalCities.get("USA"));

for (int i= 0 ; i <capitalCities.size(); i++){

    System.out.println(capitalCities.values());
}

// Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("Name: " + i + " Age: " + people.get(i));
        }


    }

}
