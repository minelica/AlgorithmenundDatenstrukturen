package FibonacciZahl;

import java.util.Scanner;

public class FibonacciIterativ {

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
            int fibPrev = 0;
            int fibCurrent = 1;
            for (int i = 2; i <= num; i++) {
                int fibNext = fibPrev + fibCurrent;
                fibPrev = fibCurrent;
                fibCurrent = fibNext;
            }
            return fibCurrent;
        }
    }
}
