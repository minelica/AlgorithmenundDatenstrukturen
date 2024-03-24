package Fakultaet;

import java.util.Scanner;

public class FakultaetRekursiv {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl ein: ");
        int num = scanner.nextInt();

        System.out.println("Fakultät von " + num + " beträgt " + fakultaet(num));
    }

    public static int fakultaet(int num) {
        if (num < 1) {
            return 1;
        } else {
            return fakultaet(num - 1) * num;
        }
    }
}