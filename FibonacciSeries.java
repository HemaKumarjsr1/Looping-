import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = scanner.nextInt();

        System.out.print("Fibonacci series up to " + limit + ": ");
        generateFibonacciSeries(limit);
    }

    private static void generateFibonacciSeries(int limit) {
        int num1 = 0, num2 = 1;

        while (num1 <= limit) {
            System.out.print(num1 + ", ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
