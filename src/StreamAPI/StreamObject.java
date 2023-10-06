package StreamAPI;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        Stream<Object> streamObject = Stream.empty();
        System.out.println(streamObject);


        // if you have objects stored in any array or any collection we can create object of stream and process it.
        String names[] = {"A","I","Y","V","D"};
        Stream<String> strStream = Stream.of(names);

        //consumer interface is passed.
        strStream.forEach(System.out::print);

        //Stream intStream = (Stream) Arrays.stream(new int[]{1,5,6,7,8});

        IntStream intStream1 = Arrays.stream(new int[]{1,5,6,7,8});


        intStream1.forEach(System.out::print); //method reference

    }
}
