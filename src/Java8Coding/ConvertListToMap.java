package Java8Coding;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args) {

        List<Employee> employeesList = List.of(new Employee(1,"A","869880662","Mumbai",41000),
                new Employee(2,"B","869880663","Delhi",56000),
                new Employee(3,"C","869880664","Pune",76000),
                new Employee(4,"D","869880665","Mumbai",91000));

        Map<String,List<Employee>> empMap=
        employeesList.stream().collect(Collectors.groupingBy(Employee::getName));

        empMap.forEach((key,value) -> System.out.println("Name: "+key+", : "+value));


    }
}
