package algorithmQuestions;

//import com.google.common.base.Splitter;
//import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/*
How to split String in java

1) String class split method
2) Pattern.compile(regex).splitAsStream(String)
3) string tokenizer
4) StringUtils,split(String"exp")
5) Splittwe.on("-").split(s);

String s = "010-34567"
 */
public class question31 {
    public static void main(String[] args) {

        String s = "091-1234567890";
       String[] str =  s.split("-");
        printString(str,"String Split Method");
       List<String> stringList = Pattern.compile("-").splitAsStream(s).collect(Collectors.toList());

       for (String string : stringList){
           System.out.println("Splitting string by using Pattern Class");
           System.out.println(string);
       }
        StringTokenizer strings = new StringTokenizer(s,"-");
        while(strings.hasMoreElements()){
            String s2 = strings.nextToken();
            System.out.println(s2);
        }
//       String[] splitArray =  StringUtils.split(s,"-");
  //      printString(splitArray,"String Utils Split");
    //    Iterable<String> results = Splitter.on("-").split(s);
      //  for (String string : results){
        //    System.out.println(string+"Guava Jar");
        //}
    }
    public static void printString(String[] str, String approach){
        System.out.println("Splitting string by using "+ approach);
        for (String string : str){
            System.out.println(string);
        }
    }
}
