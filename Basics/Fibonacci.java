package in.co.Basics;

public class Fibonacci {

    // Main method to generate and print the Fibonacci sequence
    public static void main(String[] args) {
        int terms = 15; // Number of terms to generate
        int first = 0, second = 1; // Initialize the first two terms of the Fibonacci sequence
        
        System.out.print("Fibonacci Sequence: ");
        
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " "); // Print the current term
            
            int next = first + second; // Calculate the next term
            first = second; // Update the first term
            second = next; // Update the second term
        }
    }
}
//Explanation of Code
//Initialization:
//
//The terms variable is set to 10, meaning the program will generate 10 terms of the Fibonacci sequence.
//The first and second variables are initialized to 0 and 1, respectively, which are the first two terms of the Fibonacci sequence.
//Loop:
//
//The for loop iterates from 1 to terms (inclusive). For each iteration:
//It prints the current first term.
//It calculates the next term as the sum of first and second.
//It updates first to be second and second to be the calculated next term.
//Output:
//
//The program prints the Fibonacci sequence up to the specified number of terms. In this case, it prints the first 10 terms of the Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
