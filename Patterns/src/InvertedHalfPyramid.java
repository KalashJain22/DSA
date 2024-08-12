public class InvertedHalfPyramidNumber {
    public static void main(String[] args) {
        for(int i = 5; i > 0; i--) {
            int num = 1;
            for(int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
