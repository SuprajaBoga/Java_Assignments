package com.assignments.java;
import java.util.*;
public class Assignment_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        input = input.toLowerCase();
        int n=input.length();
        Set<Character> hs = new HashSet<Character>(); //set to avoid duplicates
        for (int i = 0; i < n; i++)
        {
            if (Character.isLetter(input.charAt(i)))
            {
                hs.add(input.charAt(i));
            }
        }
        if (hs.size() == 26)
        {
            System.out.println("it contains");
        } else
            {
            System.out.println("does not contains");
        }
    }
}

//time complexity-O(n)
//space complexity-O(n)