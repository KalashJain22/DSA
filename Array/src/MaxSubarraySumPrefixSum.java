public class MaxSubarraySumPrefixSum {
    public static void main(String[] args) {
        int[] arr = {4, -2, 5, -3};
        int[] prefixArr = new int[arr.length];
        int sum = 0;
        int max = Integer.MIN_VALUE;

        prefixArr[0] = arr[0];
        for(int i = 1; i < arr.length; i++) {
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                sum = (i == 0) ? prefixArr[j] : prefixArr[j] - prefixArr[i-1];
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
