package cha23;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 4, 1, 6};
        for (int i : insertionSort(arr)) {
            System.out.println(i + " ");
        }
    }

    public static int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {

            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
        return list;

    }

}
