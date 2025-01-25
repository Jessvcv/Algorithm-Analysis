import java.math.BigInteger;

public class NotFibonacciPosition {
    public static int findPositionInNotFibonacci(BigInteger input) {

        BigInteger[] sequence = new BigInteger[1000];
        // Initial terms of the NotFibonacci sequence
        sequence[0] = BigInteger.ZERO; // First term
        sequence[1] = BigInteger.ONE;  // Second term

        int position = -1; // Default value if the position is not found
        for (int i = 2; i < sequence.length; i++) {
            // Calculate the current term using the NotFibonacci rule
            sequence[i] = sequence[i - 1].multiply(BigInteger.valueOf(3))
                    .add(sequence[i - 2].multiply(BigInteger.valueOf(2)));

            // Check if the current term matches or exceeds the input
            if (sequence[i].compareTo(input) >= 0) {
                position = (sequence[i].equals(input)) ? i + 1 : i; // 1-based index
                break;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        // Test case 1: Input 8
        BigInteger input1 = BigInteger.valueOf(8);
        System.out.println("Position for input 8: " + findPositionInNotFibonacci(input1));

        // Test case 2: Input 1640
        BigInteger input2 = BigInteger.valueOf(1640);
        System.out.println("Position for input 1640: " + findPositionInNotFibonacci(input2));
    }
}


