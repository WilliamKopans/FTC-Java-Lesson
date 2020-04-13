package com.kopans;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.print("Enter word: ");
        String origString = "RaCecar".toLowerCase();
        String input = origString;

        System.out.println(origString);

        int length = input.length();
        boolean isPalindrome = true;

        for(int beginIndex = 0; beginIndex < length; beginIndex++)
        {
            if(origString.charAt(beginIndex) != origString.charAt(length-1-beginIndex)) {
                System.out.println("String is not a palindrome.");
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("String is a palindrome.");
        }
    }


}
