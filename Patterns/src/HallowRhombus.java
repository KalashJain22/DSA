public class HollowRhombus {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < (4-i); j++) {
                System.out.print("  ");
            }
            for(int j = 0; j < 4; j++) {
                if(i == 0 || i == 4 || j == 0 || j == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
