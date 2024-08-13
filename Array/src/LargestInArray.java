public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {9, 5, 3, 7, 2, 8};
        int large = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > large) {
                large = arr[i];
            }
        }

        System.out.println("Largest value of the array is: " + large);
    }
}
