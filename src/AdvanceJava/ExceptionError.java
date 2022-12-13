package AdvanceJava;

public class ExceptionError {
    public static void main(String[] args) {

//        try {
//            int [] myNumber = {1,2,3};
//            System.out.println(myNumber[10]);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("Try Entering Another number");
//        }

        try {
            checkAge(15);

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
    static  void checkAge(int age){
        if(age< 18)
        {
    throw new ArithmeticException("Access denied - You must be at least 18");
        }else {
            System.out.println("you are old enough");
        }
    }
}
