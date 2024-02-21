package algorithmQuestions;
/*
    How to reverse words in String in java?

    Welcome to Java World
    Welcome - 0
    To - 1
    Java - 2
    World - 3

    World Java to Welcome
 */
public class question23 {
    public static void main(String[] args) {
        String str = "Welcome to Java world";
       String[] splitArray = str.split(" ");
       for (int i = splitArray.length-1;i>=0;i--){
           System.out.println(splitArray[i]);
       }


    }
}
