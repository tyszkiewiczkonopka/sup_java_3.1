package calculator;

public class Calculator<T> {
    T performOperation(T a, T b, Operation<T> operation) {
        return operation.execute(a, b);
    }
}
