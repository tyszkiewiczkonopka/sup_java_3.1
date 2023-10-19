package calculator;

public class Main {
    public static void main(String[] args) {
        Calculator<Integer> integerCalculator = new Calculator<>();
        Calculator<Double> doubleCalculator = new Calculator<>();

        Operation<Integer> addOp = new Operation<>() {
            @Override
            public Integer execute(Integer a, Integer b) {
                return a + b;
            }
        };
        Operation<Integer> substractOp = new Operation<>() {
            @Override
            public Integer execute(Integer a, Integer b) {
                return a - b;
            }
        };

        Operation<Double> multiplicateOp = (a, b) -> a * b;
        Operation<Double> divideOp = (a, b) -> a / b;

        System.out.println("Result of addition: " + integerCalculator.performOperation(4, 5, addOp));
        System.out.println("Result of subtraction: " + integerCalculator.performOperation(3, 2, substractOp));
        System.out.println("Result of multiplication: " + doubleCalculator.performOperation(3.4, 2.6, multiplicateOp));
        System.out.println("Result of division: " + doubleCalculator.performOperation(123.43, 2.6, divideOp));

    }

}