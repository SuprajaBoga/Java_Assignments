package Assignment_9;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Assignment_9
{
    public static void main(String[] args)
    {
        Pattern pattern=Pattern.compile("^[A-Z].*[.]");
        Scanner sc=new Scanner(System.in);
        Matcher matcher=pattern.matcher(sc.nextLine());
        if(matcher.find())
            System.out.println("valid");
        else
            System.out.println("invalid");
    }
}

