package algorithmQuestions;

import java.util.Scanner;

/*
Write a java program to find number of words in a sentence and the corresponding character count?
    Example: "Hello World" -> 'H','E','L','L','O','','W','O','R','L','D
    Str str = "";
    Hello -> 5
    World -> 5

    Here we have to find out number of words in a sentence and the corresponding character
    count of each word.
    1 here first we create char array from given string using string class toCharArray() methods
    2 now we iterate the char array using for loop. inside for loop we declare a string with empty implemetation
    3 whenever we found an alphabet we will perform concatination of that alphabet with the string variable and
    increment the value of i.
    4 now when i reaches to a space it will come out from the while loop and now string variable has the word is previous
    of space.
 */
public class question29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir cumle kurunuz: ");
        String str = scan.nextLine();
        count(str);

    }

    static void count(String str) {
        // Create an char array of given String
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {

            // Declare an String with Empty initialization
            String s = "";

            // When the character is not space
            while (i < ch.length && ch[i] != ' ') {

                // concat with the declared String
                s = s + ch[i]; // ''+'H','E','L','L','O','/n','W','O','R','L','D
                i++;
            }
            if (s.length() > 0) {
                System.out.println(s + "->" + s.length());
            }
        }
    }
}
