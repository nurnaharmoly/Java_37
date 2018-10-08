package cha23;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 4, 8, 1};

        for (int i : bubbleSort(arr)) {
            System.out.print(i + " ");
        }
    }

    public static int[] bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i  ];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }

        }
        return list;
    }
}
