import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter word:");
        String origString = myObj.nextLine();  // Read user input
        
        
        String input = origString.toLowerCase();


        int length = input.length();
        boolean isPalindrome = true;

        for(int beginIndex = 0; beginIndex < length; beginIndex++)
        {
            if(input.charAt(beginIndex) != input.charAt(length-1-beginIndex)) {
                System.out.println("String is not a palindrome.");
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println(origString+ " is a palindrome.");
        }




















    }}
