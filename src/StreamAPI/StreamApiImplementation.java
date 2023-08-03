
package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiImplementation {

    public static void main(String[] args) {
        System.out.println("Stream API's");

        //create list and filter all even numbers from it.

        List<Integer> list = List.of(2,4,5,7,8,10); //of() method makes it immutable list

        //list.add(10); not possible to modify.

        List<Integer> list1 = new ArrayList<>();

        list1.add(2);
        list1.add(5);
        list1.add(6);
        list1.add(11);
        list1.add(13);
        list1.add(20);

        List<Integer> list2 = Arrays.asList(5,7,4,8,11);


        // this is boilerplate code just to filer we have to create list and write loop.
        List<Integer> listEven = new ArrayList<>();

        for (Integer num : list ) {
            if (num % 2 ==0){
                listEven.add(num);
            }

        }
        System.out.println(listEven);

        //Alternative to above thing is using stream API to filter.

        Stream<Integer> stream = list.stream();// create stream
        List<Integer> newEvenList = stream.filter(t -> t % 2 == 0).toList(); //pass predicate with logic in filter

        // List<Integer> newEvenList = list.stream().filter(t->t%2 == 0).collect(Collectors.toList()); optimized

        System.out.println("Using stream - "+newEvenList);



         Double averageOfGradeA = EmployeeDatabase.getAllEmployees()
                 .stream()
                 .filter( employee -> employee.getGrade().equalsIgnoreCase("A"))
                 .map(employee -> employee.getSalary())
                 .mapToDouble(i->i*2)
                 .average()
                 .getAsDouble();

         System.out.println("Average salary of Grade A Employees - "+averageOfGradeA);


    }
}