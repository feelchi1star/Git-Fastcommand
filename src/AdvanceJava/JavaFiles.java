package AdvanceJava;

import java.io.File;
import java.io.IOException;
import  java.io.FileWriter;
import java.util.Scanner;

public class JavaFiles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Write a quote...");
        String str = sc.nextLine();
            try {
//                Writing a file
                FileWriter myWriter = new FileWriter("filename.txt");
                myWriter.write("\n" + str);
                myWriter.close();
                System.out.println("Success");

//                Reading a file

                File file = new File("filename.txt");
                Scanner myReader = new Scanner(file);

                while (myReader.hasNextLine()){
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();

//                Get Files Information

                if(file.exists()){
                    System.out.println("File name: " + file.getName());
                    System.out.println("Absolute path: " + file.getAbsolutePath());
                    System.out.println("Writeable: " + file.canWrite());
                    System.out.println("Readable " + file.canRead());
                    System.out.println("File size in bytes " + file.length());
                }else {
                    System.out.println("File Doesn't exit");
                }
//                Delete a file
                System.out.println("Do you want to delete the file? Yes=\"Y\" or No = \"N\"");
               char answer= sc.next().charAt(0);
               sc.close();
               if (answer=='Y'){
                   file.delete();
                   System.out.println("File Deleted Successfully!!!");
               }else if (answer =='N'){
                   System.out.println("Your File is Saved");
               }else {
                   System.out.println("Incorrect Input");
               }
//
            } catch (IOException e) {
                System.out.println(e);
            }

        }

}
