package algorithmQuestions;

import java.util.Scanner;

public class question28 {
    public static void main(String[] args) {
        System.out.print("Enter some string: ");
        Scanner scan = new Scanner(System.in);
        String  str = scan.nextLine();
        char[] chars = str.toCharArray();

        int count = 0;

        for(char c : chars){

            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;


            }

        }
        System.out.println("Number of vowels in string : "+count);
    }
}
