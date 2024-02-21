package algorithmQuestions;

import java.util.HashSet;
import java.util.Set;

/*
    Remove Duplicate

    Write a java program to remove duplicates from String in java?
    Ex: sandeep
    output: sandep

    ex: java
    output: java

    a) create a String in which duplicates has to removed
    b) write a method removeDuplicates Which accepts Strings. And it should return string.
    c) In removeDuplicates method Create a hashset.
    d) Create a StringBuffer
    e) Loop through the each character in the String.
    f) Take each character from array and check in hashset if it is not present in hashset add to
        hashset and StringBuffer.
    g) After iterating each character in string return the string object from the method

 */
public class question22 {
    public static void main(String[] args) {
        //a
    String str= "sandeep";
        System.out.println(removeDuplicates(str));
        String str2 = "java";
        System.out.println(removeDuplicates(str2));

    }
        //b
    public static String removeDuplicates(String str){
        //c
        Set<Character> set = new HashSet<>();
        //d
        StringBuffer sf = new StringBuffer();
        //e
        for (int i =0; i<str.length();i++){
            Character c = str.charAt(i);//str.charAt(0) ->s
            if (!set.contains(c)){      // Add if 's' is not present in hashset
                set.add(c);             // add s to the set
                sf.append(c);           // s
            }
        }
        return sf.toString();
    }

}
