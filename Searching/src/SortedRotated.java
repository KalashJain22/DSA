public class SortedRotated {
    public static void main(String[] args) {
        int[] arrLeft = {4, 5, 7, 8, 0, 2, 3};
        int[] arrRight = {7, 8, 0, 2, 3, 4, 5};
        int target = 0;

        System.out.println("Target is at index: " + search(arrLeft, target));
        System.out.println("Target is at index: " + search(arrRight, target));

    }

    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;

        while(left <= right) {
            int mid = left + (right-left)/2;

            if(arr[mid] == target) {
                return mid;
            }
            if(arr[left] <= arr[mid]) {
                if(arr[left] <= target && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if(arr[mid] < target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
