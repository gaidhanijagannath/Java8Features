package lambdaExpressions;

// i don't need this implementation when i am using the lambda exp.
public class AddNumbers implements SumInterface {
    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}
