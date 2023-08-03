package MethodReferences.ConsRefer;

public class ConsRefMain {

    public static void main(String[] args) {

        System.out.println("In Constructor reference main func.");
        //Provider provider = ()->{return new Student();}; // this is typical lambda way

        Provider provider = Student::new; // this is constructor referencing i.e returning object of student class.
        Student student = provider.getStudent();
        student.display();

    }
}
