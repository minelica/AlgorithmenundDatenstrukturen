package Sortierverfahren;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {

    /**
     * Diese Methode führt das Programm aus.
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        initRandom(data);
        System.out.print("Unsortierte Liste: ");
        printElements(data);
        sort(data);
        System.out.println();
        System.out.print("Sortierte Liste: ");
        printElements(data);
    }

    /**
     * Diese Methode sortiert die Liste nach BubbleSort aus.
     * @param data
     */
    public static void sort(ArrayList<Integer> data) {
        for (int i = data.size() - 1; i > 0; i--) {
            for (int j = data.size() - 1; j > 0; j--) {
                if (data.get(j) < data.get(j - 1)) {
                    swap(data, j - 1, j);
                }
            }
        }
    }

    /**
     * Diese Methode füllt die Liste mit den Werten von 1 bis 10 und ändert danach ihre Reihenfolge mit der shuffle-Methode.
     *
     * @param data
     */
    private static void initRandom(ArrayList<Integer> data) {
        for (int i = 1; i <= 10; i++) {
            data.add(i);
        }
        Collections.shuffle(data);
    }

    /**
     * Diese Methode gibt alle Elemente aus der Liste aus.
     *
     * @param data
     */
    private static void printElements(ArrayList<Integer> data) {
        for (int i = 0; i <= data.size() - 1; i++) {
            System.out.print(data.get(i) + " ");
        }
    }

    /**
     * Diese Methode vertauscht zwei Elemente in der Liste.
     *
     * @param data
     * @param position1
     * @param position2
     */
    private static void swap(ArrayList<Integer> data, int position1, int position2) {
        int temp = data.get(position1);
        data.set(position1, data.get(position2));
        data.set(position2, temp);
    }
}
