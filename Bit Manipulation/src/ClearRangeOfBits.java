public class ClearRangeOfBits {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(clearBits(num, 2, 4));
    }

    public static int clearBits(int num, int i, int j) {
        int a = ((~0) << (j+1));
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return num & bitMask;
    }
}
