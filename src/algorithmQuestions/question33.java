package algorithmQuestions;

import java.util.Map;
import java.util.TreeMap;

/*
Print number of words, vowels and frequency of each character in String
wordCount = 0;
vowelCount = 0;
upperCaseCount = 0;


 */
public class question33 {
    public static void main(String[] args) {
        String str = "Learn With Cihan Celik.";
        question33 p = new question33();
        p.getWordVowelCount(str);
        p.frequency(str);

    }

    private void frequency(String str) {
        int wordCount = 0;
        int vowelCount = 0;
        int upperCaseCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            switch (c) {
                case ' ':
                case '.':
                    wordCount++;
            }
            switch (c) {
                case 'A':
                case 'E':
                case 'I':
                case 'U':
                case 'O':
                case 'a':
                case 'e':
                case 'i':
                case 'u':
                case 'o':
                    vowelCount++;
            }
            if (c >= 65 && c <= 90) {
                upperCaseCount++;
            }
        }
        System.out.println("WordCount= "+wordCount);
        System.out.println("VowelCount= "+vowelCount);
        System.out.println("UpperCase= "+upperCaseCount);
    }

    private void getWordVowelCount(String str) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            Integer c = map.get(str.charAt(i));

            if (map.get(str.charAt(i))==null){
                map.put(str.charAt(i),1);
            }else{
                map.put(str.charAt(i),++c);
            }
        }
        for (Map.Entry entry:map.entrySet()){
            System.out.println("Character= "+entry.getKey());
            System.out.println("Frequency= "+entry.getValue());
        }
    }
}
