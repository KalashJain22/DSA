import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {1, 3, 4, 6, 8, 9, 11, 13};
        System.out.print("Enter the number you want to search: ");
        int key = input.nextInt();
        int num = search(arr, key);

        if(num == -1) {
            System.out.println("Number is not found.");
        } else {
            System.out.println("Number is found at index " + num);
        }
    }

    public static int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(arr[mid] == key) {
                return mid;
            }
            if(arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
