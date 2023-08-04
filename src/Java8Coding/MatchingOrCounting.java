package Java8Coding;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MatchingOrCounting {

    public static void main(String[] args) {

        //count of same elements

        String[] names ={"jagannath","sandeep","jagannath","Saurabh","Hitesh","Rohan"};

        Supplier<Stream<String>> inputStream = () -> Stream.of(names);
        //we are creating supplier of streams and getting new stream whe


        //with below code is we cant reuse the stream.

        /*Stream<String> namesList  = Arrays.asList(names).stream();
        namesList.forEach(System.out::println); // USE 1 - OK

        USE 2 - NOT OK
        Long count = namesList.filter(e -> e.equalsIgnoreCase("jagannath") *//*"jagannath" ::equalsIgnoreCase*//* ).count();
        System.out.println(count);*/

        inputStream.get().forEach(System.out::println); // New stream everytime with get() method.

        Long count = inputStream.get().filter(e -> e.equalsIgnoreCase("jagannath")).count();
                System.out.println(count);













    }
}
