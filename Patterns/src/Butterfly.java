public class Butterfly {
    public static void main(String[] args) {
        int space1 = 8;
        for(int i = 0; i < 5; i++) {
                for(int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                for (int k = 0; k < space1; k++) {
                    System.out.print("  ");
                }
                for(int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                space1 -= 2;
                System.out.println();
        }

        int space2 = 0;
        for(int i = 5; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            for (int k = 0; k < space2; k++) {
                System.out.print("  ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            space2 += 2;
            System.out.println();
        }
    }
}
