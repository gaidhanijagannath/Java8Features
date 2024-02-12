package Java8Coding;

import java.util.Arrays;
import java.util.List;

public class ArrayMultiplicationUsingStream {
    public static void main(String[] args) {

        Integer[] numbers = {5,6,8,3,2};


<<<<<<< Updated upstream
        Integer multiplication = numberList.stream()
                                           .reduce(1,(start,next)->start*next);
=======
        Integer multiplication =Arrays.stream(numbers)
                                      .reduce(1,(a,b) -> a*b);

>>>>>>> Stashed changes
        System.out.println(multiplication);


    }
}
