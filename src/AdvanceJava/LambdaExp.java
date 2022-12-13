package AdvanceJava;

interface StringFunc{
    String run(String str);
}
public class LambdaExp {
    public static void main(String[] args) {

StringFunc str = (s)-> s + "2";
       String st = str.run("John");
        System.out.println(st);
    }
}
