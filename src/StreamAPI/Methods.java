package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {

    public static void main(String[] args) {

        //filter(Predicate interface)

        List<String> list = List.of("Jagannath","Saurabh","Hitesh","Sandeep");
        Stream<String>  nameStream = list.stream();
        List<String> namesStartsWithA = list.stream().filter((e)->e.startsWith("J") || e.startsWith("j") || e.startsWith("S")).collect(Collectors.toList());
        System.out.println(namesStartsWithA);

        namesStartsWithA.forEach(e-> System.out.println(e));
        //namesStartsWithA.forEach(System.out::println); method reference



        //map(function interface) - operation on each element and returns it.
        List<Integer> numList = List.of(4,5,8,9);
        System.out.println(numList.stream().map(i -> i*i).collect(Collectors.toList()));


        list.stream().sorted().forEach(System.out::println);

        System.out.println("Min Number- "+numList.stream().min(Integer::compareTo).get()); //using method reference.
        System.out.println("Max Number- "+numList.stream().max((x,y)-> x.compareTo(y)).get());


        //sorted()
        List<String> names = Arrays.asList("Reflect","Collection","Stream");
        List<String> result = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);


        //sum of even numbers.
        List<Integer> number = Arrays.asList(2,3,4,5,8,11);
        int even = number.stream()
                .filter(x->x%2 == 0)
                .reduce(0,(ans,i)-> ans+i); //identity is initial value.
        System.out.println(even);

        //Max and Min finding.
        Integer maxNumber = number.stream()
                .reduce(Integer.MIN_VALUE,(max,input) -> max > input ? max : input);
        // OR number.stream().reduce(Integer::max).get();

        System.out.println(maxNumber);


        String maxString = names.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(maxString);

    }
}
