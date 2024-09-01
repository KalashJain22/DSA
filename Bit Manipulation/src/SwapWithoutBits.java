public class SwapWithoutBit {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;

        System.out.printf("Before Swapping: x=%d, y=%d\n", x, y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.printf("After Swapping: x=%d, y=%d\n", x, y);
    }
}
