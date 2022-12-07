package PastAndAnswer2020;

// This question is a calculator based on Java Order of Precedence
public class Question1C {

    public static void main(String[] args) {
        int people = 10;

        people++; //auto increment by +1.  people = 11 in the next line

        System.out.println(people);

        people--; // auto decrement  by -1. here people = 11 and after the decrement people = 10 in the next line


        System.out.println(people);

        people += 5; // auto increment by 5. Thus, that is the same as people = people + 5. here people = 15 in the
        // next line

        System.out.println(people);

        people -=7; // auto decrement by 7, thus, that is the same as people = people - 7. Therefore, people =8 in
        // the next line

        System.out.println(people);

        people *=2; // auto multiply by 2, thus, that is the same as people = people * 2. Therefore, people =16 in
        // the next line

        System.out.println(people);

// You can also perform the same operation in the print method()
        System.out.println(people++); //people = 16 but 17 in the next line
        System.out.println(people); // people = 17
        System.out.println(--people); // this is the same as people= people -1 . people =16





/* Note:
- Next Line means in the next instance where people or the variable is used.

**YOU CAN UNCOMMENT THE DISPLAY STATEMENTS TO SEE THE RESULTS IN THE CONSOLE **
* */

    }
}
// Thank you!!!