package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

    public static List<Employee> getAllEmployees(){

        return Stream.of(
                 new Employee("jagannath",86988, 41000,"A")
                ,new Employee("Sandeep",942276, 43000, "B")
                ,new Employee("jagannath",86988, 41000,"C")
                ,new Employee("jagannath",86988, 49000,"A")
        ).collect(Collectors.toList());
    }
}
