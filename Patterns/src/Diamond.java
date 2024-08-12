public class Diamond {
    public static void main(String[] args) {
        int space1 = 4;
        int times1 = 1;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < space1; j++) {
                System.out.print("  ");
            }
            for(int j = 0; j < times1; j++) {
                System.out.print("* ");
            }
            times1 += 2;
            space1--;
            System.out.println();
        }

        int space2 = 1;
        int times2 = 7;
        for(int i = 4; i > 0; i--) {
            for(int j = 0; j < space2; j++) {
                System.out.print("  ");
            }
            for(int j = 0; j < times2; j++) {
                System.out.print("* ");
            }
            times2 -= 2;
            space2++;
            System.out.println();
        }
    }
}
