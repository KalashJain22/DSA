public class FastExponentiation {
    public static void main(String[] args) {
        int num = 3;
        int a = 5;
        System.out.println("Exponent of " + num + " by " + a + " is: " + exponent(num, a));
    }

    public static int exponent(int num, int a) {
        int ans = 1;
        while(a > 0) {
            if((a & 1) != 0) {
                ans *= num;
            }
            num *= num;
            a = a >> 1;
        }
        return ans;
    }
}
