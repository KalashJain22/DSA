public class InvertedRotatedHalfPyramid {
    public static void main(String[] args) {
        int space = 4;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            space--;
            System.out.println();
        }
    }
}
