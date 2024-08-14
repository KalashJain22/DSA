public class MaxSubarraySumBruteForce {
    public static void main(String[] args) {
        int[] arr = {-2, 5, 3, -6, 8};
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                sum = 0;
                for(int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.print(sum + " ");
                if(sum > max) {
                    max = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum sum of sub arrays is: " + max);
    }
}
