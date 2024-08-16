import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 3, 1, 5};

        System.out.println("After sorting in increasing order: " + insertion(arr));
    }

    public static String insertion(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int pre = i-1;
            while(pre >= 0 && arr[pre] > curr) {
                arr[pre+1] = arr[pre];
                pre--;
            }
            arr[pre+1] = curr;
        }
        return Arrays.toString(arr);
    }
}
