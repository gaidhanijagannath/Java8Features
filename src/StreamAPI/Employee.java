package StreamAPI;


public class Employee {
    private String name;
    private long phoneNumber;
    private double salary;
    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", grade='" + grade + '\'' +
                '}';
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, long phoneNumber, double salary, String grade) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.grade = grade;
    }


}
