public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Sum of diagonals of an array is: " + sum(arr));
    }

    public static int sum(int[][] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                if(i == j) {
                    sum += arr[i][j];
                } else if(i+j == arr.length-1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
