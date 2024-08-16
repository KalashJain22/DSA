import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2, 6};

        System.out.println("After sorting in increasing order: " + selection(arr));
    }

    public static String selection(int[] arr) {
        for(int i = 0; i < arr.length-1; i++) {
            int min = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return Arrays.toString(arr);
    }
}
