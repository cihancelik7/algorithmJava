package algorithmQuestions;

import java.util.Scanner;

/*
How to reverse String in java using recursion?

Ex : Sandy -> ydnas
 */
public class question30 {
    public static void main(String[] args) {
        String s = "Sandy";
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String str = scan.nextLine();
        System.out.println( recursiveString(s));
        System.out.println(recursiveString(str));

    }

    private static String recursiveString(String s) {

        if (s == null || s.length() <= 1) {
            return s;
        }

        return recursiveString(s.substring(1)) + s.charAt(0);
    }
}
