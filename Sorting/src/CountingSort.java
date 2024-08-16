import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 6, 5, 2};

        System.out.println("After sorting in increasing order: " + counting(arr));
    }

    public static String counting(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int[] count = new int[max+1];
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        return Arrays.toString(arr);
    }
}
