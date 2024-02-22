package algorithmQuestions;
/*
how to find First Non-Repeated Character From String?
We can solve this program in three different way.

Approach1.)
1) it first gets character array from given String
2) build linked hash map with character as key and their count as value. if a key
already exists increment the value else store 1 for that corresponding key.
3) in next step it loop through LinkedHashMap to find an entry with value 1, that's your
first non-repeated character, because LinkedHashMap maintains insertion order, and we iterate through
character array from beginning to end.

Bad part is it requires two iteration. first one is proportional to number of character in String , and second
is proportional to number of duplicate characters in String

In worst case, where String contains non-repeated character at end, it will take 2*N time to solve this problem.

Ex: aabbdef
Step 1:[a,a,b,b,d,e,f]

Linked HashMap
    Key -- Value
     a      1+1=2
     b      1+1=2
     d      1
     e      1
     f      1

 */

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;

public class question26 {
    public static void main(String[] args) {
        char c = getFirstNonRepeatChar("aabbddef");
        System.out.println("Non Repeat Character= "+c);

    }
    public static char getFirstNonRepeatChar(String str){
        Map<Character,Integer> countMap = new LinkedHashMap<Character,Integer>(str.length());
                for(char ch : str.toCharArray()){
                    countMap.put(ch,countMap.containsKey(ch)?countMap.get(ch)+1:1);
                }
                for (Entry<Character,Integer> entry  : countMap.entrySet()){
                    if (entry.getValue()==1){
                        return entry.getKey();
                    }
                }
                throw new RuntimeException("didn't find any non repeated Character");
    }
}

































