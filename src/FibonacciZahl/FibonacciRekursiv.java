package FibonacciZahl;

import java.util.Scanner;

public class FibonacciRekursiv {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        int num = scanner.nextInt();

        System.out.println("Fibonacci-Zahl von " + num + " beträgt " + fibonacci(num));
    }

    private static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        } else {
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }
}
