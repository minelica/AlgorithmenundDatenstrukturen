package Sortierverfahren;

public class MergeSort {

    public static void main(String[] args) {
        int left[] = {11, 13, 15, 17, 18};
        int right[] = {1, 2, 3, 5, 7};
        int mergedArray[] = new int[10];

        printLeftAndRight(left, right);

        merge(left, right, mergedArray);

        System.out.println();
        System.out.print("Gemergtes Array: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }

    /**
     * In dieser Methode werden die Arrays "left" und "right" zusammengeführt.
     * Zuerst werden zwei Arrays zusammengefügt, bis das Ende eines der beiden erreicht ist.
     * Danach werden alle verbliebenden Elemente aus dem linken / rechten Array kopiert.
     * i -> Index left
     * j -> Index right
     * k -> Index mergedArray
     * @param left
     * @param right
     * @param mergedArray
     * @return
     */
    public static int[] merge(int[] left, int[] right, int[] mergedArray) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mergedArray[k] = left[i];
                i++;
            } else {
                mergedArray[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            mergedArray[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            mergedArray[k] = right[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    public static void printLeftAndRight(int[] left, int[] right) {
        System.out.print("Linke Seite: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(left[i] + " ");
        }

        System.out.println();

        System.out.print("Rechte Seite: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(right[i] + " ");
        }

    }

}

