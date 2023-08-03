package functionalInterfaces;

import java.util.function.Supplier;

public class SupplierInterface {

    public static void main(String[] args) {

        Supplier<Double> getDoubleValue =()->Math.random();
        System.out.println(getDoubleValue.get()); //no input

    }
}
