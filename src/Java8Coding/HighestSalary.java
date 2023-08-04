package Java8Coding;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HighestSalary {
    public static void main(String[] args) {

        List<Employee> employeesData = List.of(new Employee(1,"A","869880662","Mumbai",41000),
                new Employee(2,"B","869880663","Delhi",56000),
                new Employee(3,"C","869880664","Pune",76000),
                new Employee(4,"D","869880665","Mumbai",91000));


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
        Optional<Employee> maxSalEmployee =
                employeesData.stream().max(Comparator.comparing(Employee::getSalary));//returns optional

        System.out.println("Highest Salaried employee =>  " + maxSalEmployee.get()); //get() to get employee out of optional.


        //nth highest salary
        Optional<Employee> secondHighestSalaryEmployee =
                employeesData.stream()
                        .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                        .skip(1) //
                        .findFirst();


        System.out.println(secondHighestSalaryEmployee.isPresent() ?
                "2nd Highest salaried employee => "+secondHighestSalaryEmployee.get()
                : "Not Available.");

        //suggested way to print.
        //System.out.println(secondHighestSalaryEmployee.map(employee -> "2nd Highest salaried employee => " + employee).orElse("Not Available."));




        List<Integer> salaries = List.of(234,677,789,654,567);
        Optional<Integer> maxSal = salaries.stream()
                                           .max(Comparator.comparing(Integer::valueOf));

        System.out.println(maxSal.map(e -> "Max salary - " + e).orElse("Data not available."));


    }
}
