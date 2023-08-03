package MethodReferences;

public class MethodRefImpl {

    public static void main(String[] args) {

        System.out.println("Learning method referencing.");

        //implementation for workInterface

        WorkInterface workInterface = ()-> System.out.println("lambda implementation of work interface");
        workInterface.doTask();

        /*
        Referencing method means we have same method created elsewhere which has same body so rather than providing
        implementation again here we will refer that existing method while implementing this interface.
        */

        //1)method referring static methods.
        WorkInterface workInterface1 = Work::doActivity;
        workInterface1.doTask();

        Runnable runnable = Work::doThreadTask;
        Thread thread = new Thread(runnable);
        thread.start();

        //2)method referring instance method.
        Work w1 = new Work(); // we need object of class to refer non-static method.

        WorkInterface workInterface2 = w1::doActivityInstance;
        workInterface2.doTask();


        Runnable runnable1 = w1::printNumbers;

        Thread thread1 = new Thread(runnable1);
        thread1.start();



    }
}