public class SetBits {
    public static void main(String[] args) {
        int num = 15;
        System.out.println("Count of set bits in " + num + " is: " + count(num));
    }

    public static int count(int num) {
        int count = 0;
        while(num > 0) {
            if((num & 1) != 0) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
}
