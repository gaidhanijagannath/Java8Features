package functionalInterfaces;

import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String[] args) {

        Function<Integer,String> function = t -> "Input "+t+" Multiplied by 20 = " + t*20;
        System.out.println(function.apply(10));


    }
}
