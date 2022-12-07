package PastAndAnswer2020;

//The Question 1A will be Solved using the Switch case

// Steps to Solve this Questions

// 1) Declaring or initialising of the identifier which in our case is worker

// 2) Creating Switch case Block to test the worker number

// 3) Returning the Approach Message for each work

// That's All


public class Question1A {

    public static void main(String[] args) {
        int workers = 15; // the Data type for Worker should be integer since we are dealing with number
        workers += 5;
        System.out.println(workers); // here worker = 20
        System.out.println(workers++); // here worker=20 and worker was automatically incremented
        System.out.println(workers); // here the new value worker was printed. worker = 21

//        Switch case
        switch (workers) { // switch receives the worker as a parameter

            case 20:
                System.out.println("Desk Attendant");
                break;
            case 30:
                System.out.println("Principal Officer");
                ;
                break;
            case 40:
                System.out.println("Admin head");
                break;
            default:
                System.out.println("You are not employable");

        }
    }
// Thank you!!!

}

