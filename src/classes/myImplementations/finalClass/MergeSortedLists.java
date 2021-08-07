package classes.myImplementations.finalClass;

import java.util.Arrays;

public class MergeSortedLists {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 4};
        int[] a2 = {1, 3, 4};
        System.out.println(Arrays.toString(mergeSortedLists(a1, a2)));

        int[] a3 = {};
        int[] a4 = {0};
        System.out.println(Arrays.toString(mergeSortedLists(a3, a4)));

        int[] a5 = {};
        int[] a6 = {};
        System.out.println(Arrays.toString(mergeSortedLists(a5, a6)));
    }

    public static int[] mergeSortedLists(int[] arr1, int[] arr2) {
        if (arr1.length == 0) {
            return arr2;
        } else if (arr2.length == 0) {
            return arr1;
        }

        int[] result = new int[arr1.length + arr2.length];
        int counterArrOne = 0;
        int counterArrTwo = 0;
        for (int i = 0; i < result.length; i++) {
            if (arr1[counterArrOne] <= arr2[counterArrTwo]) {
                result[i] = arr1[counterArrOne];
                if (counterArrOne + 1 < arr1.length) {
                    counterArrOne++;
                }
            } else {
                result[i] = arr2[counterArrTwo];
                if (counterArrTwo + 1 < arr1.length) {
                    counterArrTwo++;
                }
            }
        }
        return result;
    }
}
