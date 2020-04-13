package com.kopans;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter word:"); //Asks for a word
        String origString = myObj.nextLine();  // Read user input


        String input = origString.toLowerCase(); //changes variable name and makes the word lowercase since Java is case sensitive


        int length = input.length(); //sets length to the length of the input
        boolean isPalindrome = true; //starts off assuming that it is a palindrome

        for(int beginIndex = 0; beginIndex < length; beginIndex++) //for loop going through word
        {
            if(input.charAt(beginIndex) != input.charAt(length-1-beginIndex)) {  //checking if the characters are not equivalent
                System.out.println(origString+ " is not a palindrome.");
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) { //If Boolean isPalindrome is still true prints that it is a palindrome
            System.out.println(origString+ " is a palindrome.");
        }

    }}
