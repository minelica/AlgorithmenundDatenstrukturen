// Direktes Auswählen / SelectionSort

package Sortierverfahren;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {

    public static ArrayList<Integer> list = new ArrayList<>();

    /**
     * Diese Methode führt das Programm auf.
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //    initStatic(list);
        initRandom(list);
        System.out.print("Unsortierte Liste: ");
        printElements(list);
        sort(list);
        System.out.println();
        System.out.print("Sortierte Liste: ");
        printElements(list);
    }

    /**
     * Diese Methode sortiert die Liste 'list'.
     *
     * @param list
     */
    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i <= list.size() - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j <= list.size() - 1; j++) {
                if (list.get(j) < list.get(smallestIndex)) {
                    smallestIndex = j;
                }
            }
            if (smallestIndex != i) {
                //    swap(i, smallestIndex);
                int temp = list.get(i);
                list.set(i, list.get(smallestIndex));
                list.set(smallestIndex, temp);
            }
        }
    }

    /**
     * Diese Methode vertauscht zwei Elemente in der Liste.
     *
     * @param position1 -> das erste zu vertauschende Element
     * @param position2 -> das zweite zu vertauschende Element
     */
    private static void swap(int position1, int position2) {
        int temp = list.get(position1);
        list.set(position1, list.get(position2));
        list.set(position1, temp);
    }

    /**
     * Diese Methode füllt die Liste mit gegebenen Werten auf.
     *
     * @param list
     */
    private static void initStatic(ArrayList<Integer> list) {
        list.add(6);
        list.add(8);
        list.add(11);
        list.add(3);
        list.add(12);
        list.add(4);
        list.add(2);
        list.add(1);
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
}

