package Fakultaet;

import java.util.Scanner;

public class FakultaetIterativ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        int num = scanner.nextInt();

        System.out.println("Fakultät von " + num + " beträgt " + fakultaet(num));
    }

    public static int fakultaet(int num) {
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}
