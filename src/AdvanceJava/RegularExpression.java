package AdvanceJava;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegularExpression {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3schools");
        boolean matchFound = matcher.find();

        if (matchFound){
            System.out.println("Match Found");
        }else {
            System.out.println("Match not found");
        }


    }
}
