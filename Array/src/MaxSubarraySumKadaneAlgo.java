public class MaxSubarraySumKadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {1, -3, 4, 5, -2};
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum < 0) {
                sum = 0;
            }
            max = Math.max(sum, max);
        }
        System.out.println("Maximum sum of sub array is: " + max);
    }
}
