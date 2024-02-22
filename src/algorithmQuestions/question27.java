package algorithmQuestions;

import java.util.Arrays;

/*
Write java program to short characters in string
ex: java aavj
j,a,v,a

    Here are the steps to be followed to short characters in string:
    1) take one string as input
    2) convert the first string to character array.
    3) short the characters in array using arrays.short() method
    4) Construct string by using sorted characted array.
 */
public class question27 {
    public static void main(String[] args) {
        String str = "cihancelik";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String sortedStr = new String(ch);
        System.out.println(sortedStr);


    }
}
