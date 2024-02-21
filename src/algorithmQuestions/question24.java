package algorithmQuestions;

import java.util.Scanner;

/*
1) if original string and reverse string are same as oer alphabetical order we say string is
   palindrome

   Step1: Input a String.
   Step2: Find the reverse of a String.
   Step3: Check the original String and reverse String are same or not.
   Step4: Id both equal print palindrome else print given strings is not palindrome.
 */
public class question24 {
    public static void main(String[] args) {
        String reverse = "";

        System.out.print("Enter the input String: ");
        Scanner scan = new Scanner(System.in);
        String original = scan.nextLine();

        for (int i=original.length()-1;i>=0;i--){
            reverse = reverse+original.charAt(i);
        }
        if (original.equals(reverse)){
            System.out.println("Given String is palindrome");
        }else {
            System.out.println("Given String is not palindrome");
        }

    }
}
