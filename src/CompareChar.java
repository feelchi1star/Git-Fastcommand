import java.util.Scanner;
public class CompareChar {
     public static void main(String[] args) {
        char input;
        System.out.println("Enter a Character");
        Scanner sc = new Scanner(System.in);
        input = sc.next().charAt(0);

        if(input =='A'){
            System.out.println("Correct you just entered character A");
        }

        else {
            System.out.println("This is not A, its = "+ input);
        }
    }
}
