package Java8Coding;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingAndMapping {
    public static void main(String[] args) {

        List<Employee> employeesList = List.of(
                new Employee(1,"Jagannath","869880662","Mumbai",41000,25),
                new Employee(2,"Jagannath","869880663","Delhi",56000,25),
                new Employee(3,"Jay","869880664","Pune",76000,27),
                new Employee(4,"Akshay","869880665","Mumbai",91000, 28),
                new Employee(5,"Saurabh","869880669","Hyderabad",80000, 30),
                new Employee(6,"Hitesh","869880610","Nasik",100000, 27));

        //convert list to map operation
        Map<String,List<Employee>> empMap=
        employeesList.stream().collect(Collectors.groupingBy(Employee::getName));

        empMap.forEach((key,value) -> System.out.println("( "+ key +","+value +" )"));



        //grouping by age and getting count of it.
        Map<Integer, Long> ageWiseCount =
                employeesList.stream().collect(Collectors.groupingBy(Employee::getAge,Collectors.counting()));

        ageWiseCount.forEach((key,value) -> System.out.println("( "+ key +","+value +" )"));


        //group employee by age.
        Map<Integer, List<Employee>> groupByAge =
                employeesList.stream().collect(Collectors.groupingBy(Employee::getAge));

        groupByAge.forEach((key,value) -> System.out.println("( "+ key +","+value +" )"));



       /* Map<Integer, String> empMap2 =
                employeesList.stream().collect(Collectors.groupingBy(Employee::getAge));

        System.out.println(empMap1);*/



    }
}
