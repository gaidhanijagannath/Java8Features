package Java8Coding;

import java.util.Arrays;
import java.util.List;

public class ArrayMultiplicationUsingStream {
    public static void main(String[] args) {

        Integer[] numbers = {5,6,8,3,2};

        List<Integer> numberList = Arrays.asList(numbers);

        Integer multiplication = numberList.stream()
                                           .reduce(1,(start,next)->start*next);
        System.out.println(multiplication);


    }
}
