package functionalInterfaces;

import java.util.function.Consumer;

class Person{
    private String name;
    private long number;


    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

public class ConsumerInterface {
    public static void main(String[] args) {

        Person person = new Person();
        Consumer<Person> consumerSetName = t -> t.setName("Jagannath");

        Consumer<Person> consumerSetNumber = t -> t.setNumber(86988066);

        //andThen()
        Consumer<Person> result = consumerSetName.andThen(consumerSetNumber);
        result.accept(person);
        System.out.println( person.getName() + " "+ person.getNumber());

    }

}
