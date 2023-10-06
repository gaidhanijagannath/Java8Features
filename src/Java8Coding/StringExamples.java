package Java8Coding;

import java.util.*;
import java.util.stream.Collectors;

public class StringExamples {
    public static void main(String[] args) {

        String input = "Hi Hello how are you";
        String[] inputArray = input.split(" ");


        //1)String joiner Java 8.
        StringJoiner joiner = new StringJoiner("-","[","]");
        for (String inputA: inputArray ) {
                joiner.add(inputA);
        }
        System.out.println("Using StringJoiner - "+joiner);




        List<String> inputList =Arrays.asList(inputArray); //creating list from array.

        //2)we can perform same operation with streams.
        String outputList1 = inputList.stream().collect(Collectors.joining(":"));
        System.out.println("Using Streams - "+outputList1);


        //3)String class join method.
        String outputList = String.join("-", inputList);
        System.out.println("Using String join - "+outputList);




        //Q - find vowels in string


        String vowelsString = "u help me find vowels in this string";

        //Way 1

        String[] vowelsCountArray = vowelsString.replaceAll(" ","").split("");
        List<String> vowelsList = Arrays.asList(vowelsCountArray);

        System.out.println("List of characters in array - " + vowelsList);

        long vowelsCnt = vowelsList.stream().filter(e ->
                        e.equalsIgnoreCase("A") ||
                        e.equalsIgnoreCase("E") ||
                        e.equalsIgnoreCase("I") ||
                        e.equalsIgnoreCase("O") ||
                        e.equalsIgnoreCase("U")
                ).distinct().count();

         //.count() returns a long.
         //.distinct().toList().size();


        System.out.println("No of vowels in list Method 1 - " + vowelsCnt);


        //finding count of each vowel
        Map<String,Long> vowelsMap =vowelsList.stream().filter(e ->
                e.equalsIgnoreCase("A") ||
                        e.equalsIgnoreCase("E") ||
                        e.equalsIgnoreCase("I") ||
                        e.equalsIgnoreCase("O") ||
                        e.equalsIgnoreCase("U")
        ).collect(Collectors.groupingBy(String::toString,Collectors.counting()));

        vowelsMap.forEach((key,value) -> System.out.println(key+" "+ value));




                //way 2
        vowelsString = vowelsString.replaceAll(" ","");


        long vowelsCnt1 = vowelsString.chars().filter(ch -> (
                        'a' == ch || 'e' == ch || 'i' == ch || 'o' == ch || 'u' == ch ||
                                'A' == ch || 'E' == ch || 'I' == ch || 'O' == ch || 'U' == ch)) // filter out vowels
                .distinct().count(); // count vowels.

        System.out.println("No of vowels in list Method 2 - " + vowelsCnt1);


         Map<String,Long> vowelsMap2  =vowelsString.chars().filter(ch -> (
                'a' == ch || 'e' == ch || 'i' == ch || 'o' == ch || 'u' == ch ||
                        'A' == ch || 'E' == ch || 'I' == ch || 'O' == ch || 'U' == ch)) // filter out vowels
                 .mapToObj(x->(char)x).collect(Collectors.groupingBy(Object::toString,Collectors.counting()));


        vowelsMap2.forEach((key,value) -> System.out.println(key+" "+ value));


    }
}
