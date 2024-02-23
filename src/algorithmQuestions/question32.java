package algorithmQuestions;

/*
How to compare two strings in java without build in functions?
Str1 = Sandeep;
Str2 = Sandeep;
 */
public class question32 {
    public static void main(String[] args) {
        String str1 = "avndeep";
        String str2 = "Sandeep";
        boolean isCompare=false;

        for (int i = 0;i<str1.length();i++){
            if (str1.charAt(i)!=str2.charAt(i)){
                isCompare = false;
                break;
            }
            isCompare = true;
        }
        System.out.println("Both the strings are equal "+isCompare);
    }
}
