public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 6, 3, 9};

        for(int i = 0; i < arr.length/2; i++) {
            int temp  = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
