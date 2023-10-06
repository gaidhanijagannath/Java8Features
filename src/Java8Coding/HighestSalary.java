package Java8Coding;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HighestSalary {
    public static void main(String[] args) {

        List<Employee> employeesData = List.of(new Employee(1,"A","869880662","Mumbai",41000,25),
                new Employee(2,"B","869880663","Delhi",56000,25),
                new Employee(3,"C","869880664","Pune",76000,28),
                new Employee(4,"D","869880665","Mumbai",91000,29));


        //employees salary greater than 50k
        List<Employee> employeesSalaryGreater50k = employeesData.stream().
                filter(employee -> employee.getSalary()>50000).toList();
        employeesSalaryGreater50k.forEach(System.out::println);


        //getting max salary
        long maximSalary =employeesData.stream()
                .map(Employee::getSalary)
                .reduce(Long.MIN_VALUE,(maxSalary,inputSalary) -> maxSalary > inputSalary ? maxSalary:inputSalary);

        System.out.println("Maximum salary amongst the Employee's - "+maximSalary);


        //getting employee with max salary
        Optional<Employee> maxSalEmployee = employeesData.stream()
                        .max(Comparator.comparing(Employee::getSalary));//returns optional

        System.out.println("Highest Salaried employee =>  " + maxSalEmployee.get()); //get() to get employee out of optional.


        //nth highest salary
        Optional<Employee> secondHighestSalaryEmployee =
                employeesData.stream()
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                        .skip(1) //
                        .findFirst();


        System.out.println(secondHighestSalaryEmployee.isPresent() ?
                "2nd Highest salaried employee => "+secondHighestSalaryEmployee.get()
                : "resource not Available.");

        //Best suggested way to print optional.
        //System.out.println(secondHighestSalaryEmployee.map(employee -> "2nd Highest salaried employee is " + employee).orElse("Not Available."));




        List<Integer> salaries = List.of(234,677,789,654,567);
        Optional<Integer> maxSal = salaries.stream()
                                           .max(Comparator.comparing(Integer::valueOf));

        System.out.println(maxSal.map(e -> "Max salary - " + e).orElse("Data not available."));




        // second-highest number in array.
        int[] numbers = {8,9,9,4,6,1};

        // agar integer datatype hota array to it was easy
        // List<Integer> listNumbers2 = Arrays.asList(numbers);

        //convert int[] array to List<Integer> ***
        List<Integer> listNumbers = Arrays.stream(numbers).boxed().toList();

        //convert int[] array to stream
        IntStream numbersStream = Arrays.stream(numbers);

        int secondHighestNumber = numbersStream
                .sorted()
                .distinct()
                .skip(numbers.length-2)
                .findFirst()
                .getAsInt();
        System.out.println(secondHighestNumber);


        System.out.println(listNumbers.stream().sorted().distinct().skip(salaries.size()-2).findFirst().get());





    }
}
