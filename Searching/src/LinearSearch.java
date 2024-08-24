import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {2, 4, 5, 7, 8, 9, 12, 13};
        System.out.print("Enter the number you want to search: ");
        int key = input.nextInt();
        int num = search(arr, key);

        if(num == -1) {
            System.out.println("Number is not found.");
        } else {
            System.out.println("Number is found at index " + num);
        }
    }

    public static int search(int[] arr, int key){
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
