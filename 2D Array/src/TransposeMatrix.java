import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        transpose(arr);
    }

    public static void transpose(int[][] arr) {
        int[][] newArr = new int[arr[0].length][arr.length];

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                newArr[j][i] = arr[i][j];
            }
        }

        System.out.println(Arrays.deepToString(newArr));
    }
}
