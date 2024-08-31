public class PowerOf2 {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(num + " is power of 2: " + isPower(num));
    }

    public static boolean isPower(int num) {
        return (num & (num-1)) == 0;
    }
}
