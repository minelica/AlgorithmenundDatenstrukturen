//Einstiegsbeispiel: Umwandlung einer Zahl im Binärsystem ins Dezimalsystem

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Einfuehrungsbeispiel {

    public static ArrayList<Integer> numbers = new ArrayList<>();


    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl im Binärsystem ein: ");
        int num = scanner.nextInt();

        addNumbers(numbers, num);
        System.out.println("Dezimalzahl: " + convertToDecimal());

    //  Hier wird getestet, ob die Liste richtig aufgefüllt ist
    //    for (int i = 0; i <= numbers.size()-1; i++) {
    //        System.out.println(numbers.get(i));
    //    }

    }

    /**
     * Diese Methode führt die Umwandlung einer Zahl im Binärsystem ins Dezimalsystem aus.
     * 'result' wird in jeder Iteration auf die Summe 'sum' addiert und dr Multiplikator 'multiplier' wird ebenfalls in jeder Iteration aktualisiert.
     * Iteration = Schleifendurchlauf
     * @return -> gibt Dezimalzahl zurück
     */
    public static int convertToDecimal() {
        int multiplier = 1;
        int sum = 0;

        for (int i = 0; i <= numbers.size()-1; i++) {
            int result = numbers.get(i) * multiplier;
            sum += result;
            multiplier *= 2;
        }
        return sum;
    }

    /**
     * Diese Methode fügt die Einzelziffern der Variable 'num' in 'numbers' hinzu.
     * @param numbers
     * @param num
     */
    public static void addNumbers(ArrayList<Integer> numbers, int num) {
        while (num > 0) {
            int lastDigit = num % 10;
            numbers.add(lastDigit);
            num /= 10;
        }
    }
}
