package algorithmQuestions;

import java.util.Arrays;
import java.util.Scanner;

/*
    Write a Java program to check two strings are anagrams are not using arrays
    comparison?
    Two Strings are anagrams if they contain same characters but in different order.

    Ex: JAVA AVAJ

    1) Take two strings as input
    2) convert two strings to character array.
    3) Sort two character arrays using arrays.sort() method.
    4) Compare two character arrays if they are equal they are anagrams otherwise they are not
 */
public class question25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write a first word for anagram: ");
        String str1= scan.nextLine();
        System.out.print("Write a second word for anagram: ");
        String str2= scan.nextLine();
        System.out.println("Both Strings are anagrams: "+ anagramCheck(str1,str2));

    }
    public static boolean anagramCheck(String str1,String str2){
        char[] charArrayFromString1 = str1.toCharArray();
        char[] charArrayFromString2 = str2.toCharArray();
        Arrays.sort(charArrayFromString1);
        Arrays.sort(charArrayFromString2);

        return Arrays.equals(charArrayFromString1,charArrayFromString2);
    }
}
