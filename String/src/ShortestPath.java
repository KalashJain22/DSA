import java.util.Scanner;

public class ShortestPath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0, y = 0;
        float result = 0;
        System.out.print("Enter the path directions to check (EWNS): ");
        String path = input.nextLine();

        for(int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if(dir == 'E') {
                x++;
            } else if(dir == 'W') {
                x--;
            } else if(dir == 'N') {
                y++;
            } else if(dir == 'S') {
                y--;
            }

            int x2 = x*x;
            int y2 = y*y;
            result = (float)Math.sqrt(x2 + y2);
        }
        System.out.println("Shortest distance you can take is: " + result);
    }
}
