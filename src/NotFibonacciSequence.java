import java.math.BigInteger;

public class NotFibonacciSequence {
    public static void notFibonacci(int terms) {
        // Check for invalid input to avoid errors
        if (terms <= 0) {
            System.out.println("Number of terms must be greater than 0.");
            return;
        }

        // Initialize the first two terms since rules are n = 0 & n1 = 1
        BigInteger n1 = BigInteger.ZERO; // First term: 0
        BigInteger n2 = BigInteger.ONE;  // Second term: 1

        // Print the first term
        System.out.print(n1);
        // Print the second term if the input is more than 1
        if (terms > 1) {
            System.out.print(", " + n2);
        }

        // Generate and print the rest of the sequence; i = 3 since we are starting at the 3rd term
        for (int i = 3; i <= terms; i++) {
            //given equation
            BigInteger nextTerm = (n2.multiply(BigInteger.valueOf(3))).add(n1.multiply(BigInteger.valueOf(2)));
            System.out.print(", " + nextTerm);
            // Update for the next iteration
            n1 = n2;
            n2 = nextTerm;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int terms = 10; // Change this value to generate more or less terms
        System.out.println("NotFibonacci sequence with " + terms + " terms:");
        notFibonacci(terms);
    }
}
