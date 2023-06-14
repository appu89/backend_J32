class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class CustomRex {
    public static void divideNumbers(int dividend, int divisor) throws CustomException {
                    try {
                        int result = dividend / divisor;
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        throw new CustomException("Divide by zero error");
                    }
                }

                public static void main(String[] args) {
                    int dividend = 10;
                    int divisor = 10;

                    try {
                        divideNumbers(dividend, divisor);
                    } catch (CustomException e) {
                        System.out.println("Caught CustomException: " + e.getMessage());
                    }
                }
            }
