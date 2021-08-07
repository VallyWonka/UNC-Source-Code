package classes.myImplementations.finalClass;

public class SearchInsertPosition {
    public int searchInsertPosition(int[] arr, int target) {
        if (arr.length == 0) {
            return 0;
        }

        int leftPointer = 0;
        int rightPointer = arr.length - 1;
        int mid = (arr.length - 1) / 2;

        while (leftPointer <= rightPointer) {
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                rightPointer = mid - 1;
                if (target > arr[mid - 1]) {
                    return rightPointer + 1;
                }
            } else {
                leftPointer = mid + 1;
                if (target < arr[mid + 1]) {
                    return leftPointer - 1;
                }
            }
            mid = mid / 2 + leftPointer;
        }
        return mid;
    }
}
