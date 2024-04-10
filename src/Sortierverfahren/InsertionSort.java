package Sortierverfahren;

import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        initRandom(list);
        System.out.println("Unsortierte Liste: ");
        printElements(list);
        sort(list);
        System.out.println();
        System.out.println("Sortierte Liste: ");
        printElements(list);
    }

    /**
     * In dieser Methode wird die gegebene ArrayList mithilfe von InsertionSort aussortiert.
     *
     * Die erste Schleife iteriert über die elemente der Liste, beginnend mit dem zweiten
     * Element (i=1 / Index 1) bis zum letzten Element (list.size()-1).
     *
     * Die zweite Schleie (innere Schleife) iteriert rückwärts durch den bereits
     * sortierten Teil der Liste, beginnend mit dem Element direkt vor dem aktuellen Element.
     *
     * @param list
     */
    public static void sort(ArrayList<Integer> list) {
        for (int i = 1; i <= list.size() - 1; i++) {
            int keyValue = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > keyValue) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, keyValue);
        }
    }

    /**
     * Diese Methode füllt die Liste mit den Werten von 1 bis 10 auf und mischt sie mit der Shuffle-Methode.
     *
     * @param list
     */
    private static void initRandom(ArrayList<Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
    }

    /**
     * Diese Methode gibt alle Elemente aus der Liste aus.
     *
     * @param list
     */
    private static void printElements(ArrayList<Integer> list) {
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.print(list.get(i) + " ");
        }
    }

}

