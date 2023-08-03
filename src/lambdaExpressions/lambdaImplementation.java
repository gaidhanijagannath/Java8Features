package lambdaExpressions;

public class lambdaImplementation {
    public static void main(String[] args) {

        System.out.println("Lambda Expressions!");

        //normal way of accessing MyInterface
        MyInterface myInterface = new ImplementationClass();
        myInterface.show();

        //Anonymous class way - no need to create class separately.

        MyInterface myInterface1 = new MyInterface() {
            @Override
            public void show() {
                System.out.println("Accessing func interface using anonymous class.");
            }
        };

        myInterface1.show();

        //lambda way -best

        MyInterface myInterface2 = () -> System.out.println("Accessing MyInterface interface using lambda way.");
        myInterface2.show();


       //1)
       /* SumInterface sumInterface = (int a,int b)-> {
           return a + b;
       };
       */

        //2)SumInterface sumInterface = Integer::sum; // .

        //3)

        SumInterface sumInterface = (a, b) -> a + b; // optimized way.
        System.out.println("Sum is - "+ sumInterface.sum(4, 5));


        ReturnLength returnLength = (str) -> str.length();
        System.out.println("Length of string is - "+ returnLength.strLength("Jagannath Dnyaneshwar Gaidhani"));


    }

}