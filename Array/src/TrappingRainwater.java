public class TrappingRainwater {
    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};

        int result1 = trappedWater(height);
        int result2 = trappedWaterTwoPointer(height);

        System.out.println("Trapped water level is: " + result1);
        System.out.println("Trapped water level is: " + result2);
    }

    public static int trappedWater(int[] height) {
        int n = height.length;

        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        for(int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += (waterLevel - height[i]);
        }

        return trappedWater;
    }

    public static int trappedWaterTwoPointer(int[] height) {
        int n = height.length;

        int trappedWater = 0;
        int left = 0;
        int right = n - 1;

        int rightMax = height[right];
        int leftMax = height[left];

        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                trappedWater += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                trappedWater += rightMax - height[right];
            }
        }

        return trappedWater;
    }
}
