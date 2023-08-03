package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateInterface {



    public static void main(String[] args) {

        //Predicate

        /*
        1.Code re-usability in unit-testing.
        2.For tasks involving item evaluation based on predefined criteria.
        3.To apply filter for a collection of objects.
        4.Avoids boilerplate code.
        */

        Predicate<String> checkLength = str -> str.length()>5;
        System.out.println(checkLength.test("Jagannath"));

        //predicate chaining

        Predicate<Integer> isAdult = age -> age >= 18;
        Predicate<Integer> notASeniorCitizen = age -> age < 60;
        Predicate<Integer> combinedPredicateForAge = isAdult.and(notASeniorCitizen); // or(), negate() etc

        System.out.println(combinedPredicateForAge.test(25));
        System.out.println(combinedPredicateForAge.test(65));


    }
}